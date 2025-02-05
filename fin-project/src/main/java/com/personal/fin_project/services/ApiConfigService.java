package com.personal.fin_project.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.personal.fin_project.entities.BitcoinPriceEntity;
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

    public String getBitcoinPrice() {
        String url = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=usd&include_24hr_change=true&include_last_updated_at=true&precision=2";
        String response = restTemplate.getForObject(url, String.class);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(response);

            double price = jsonNode.get("bitcoin").get("usd").asDouble();
            double last24HoursChange = jsonNode.get("bitcoin").get("usd_24h_change").asDouble();
            long timeStamp = jsonNode.get("bitcoin").get("last_updated_at").asLong();

            BitcoinPriceEntity bitcoinPriceEntity = new BitcoinPriceEntity(price, last24HoursChange, timeStamp);

            if (bitcoinPriceRepository.findByTimeStamp(bitcoinPriceEntity.getTimeStamp()).isEmpty()){
                bitcoinPriceRepository.save(bitcoinPriceEntity);
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return response;
    }
}
