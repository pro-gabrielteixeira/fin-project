package com.personal.fin_project.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.personal.fin_project.DTO.BitcoinDTO;
import com.personal.fin_project.entities.BitcoinFearAndGreedEntity;
import com.personal.fin_project.entities.BitcoinPriceEntity;
import com.personal.fin_project.repositories.BitcoinFearAndGreedRepository;
import com.personal.fin_project.repositories.BitcoinPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ApiConfigService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BitcoinPriceRepository bitcoinPriceRepository;

    @Autowired
    private BitcoinFearAndGreedRepository bitcoinFearAndGreedRepository;

    public BitcoinPriceEntity getBitcoinPrice() {
        String url = "https://api.alternative.me/v2/ticker/bitcoin/";
        String response = restTemplate.getForObject(url, String.class);

        BitcoinPriceEntity bitcoinPriceEntity = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(response);

            double price = jsonNode.get("data").get("1").get("quotes").get("USD").get("price").asDouble();
            double last24HoursChange = jsonNode.get("data").get("1").get("quotes").get("USD").get("percentage_change_24h").asDouble();
            long timestamp = jsonNode.get("data").get("1").get("last_updated").asLong();

            bitcoinPriceEntity = new BitcoinPriceEntity(price, last24HoursChange, timestamp);

            if (bitcoinPriceRepository.findByTimestamp(timestamp).isEmpty()){
                bitcoinPriceRepository.save(bitcoinPriceEntity);
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return bitcoinPriceEntity;
    }

    public BitcoinFearAndGreedEntity getBitcoinFearAndGeed() {
        String url = "https://api.alternative.me/fng/";
        String response = restTemplate.getForObject(url, String.class);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(response);

            int value = jsonNode.get("data").get(0).get("value").asInt();
            String valueClassification = jsonNode.get("data").get(0).get("value_classification").asText();
            Long timestamp = jsonNode.get("data").get(0).get("timestamp").asLong();
            int timeUntilUpdate = jsonNode.get("data").get(0).get("time_until_update").asInt();

            BitcoinFearAndGreedEntity bitcoinFearAndGreedEntity = new BitcoinFearAndGreedEntity(value, valueClassification, timestamp, timeUntilUpdate);

            if (bitcoinFearAndGreedRepository.findByTimestamp(timestamp).isEmpty()) {
                bitcoinFearAndGreedRepository.save(bitcoinFearAndGreedEntity);
            }

            return bitcoinFearAndGreedEntity;

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public BitcoinDTO getBitcoin() {
        BitcoinFearAndGreedEntity btcFng= getBitcoinFearAndGeed();
        BitcoinPriceEntity btcPrice = getBitcoinPrice();

        return new BitcoinDTO(btcPrice.getPrice(), btcPrice.getLast24HoursChange(), btcPrice.getTimestamp(), btcFng.getValue(), btcFng.getValueCertification(), btcFng.getTimestamp(), btcFng.getTimeUntilUpdate());
    }
}
