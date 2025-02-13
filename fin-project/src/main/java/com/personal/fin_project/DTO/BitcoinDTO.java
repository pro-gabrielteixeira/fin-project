package com.personal.fin_project.DTO;

import java.time.LocalDateTime;

public class BitcoinDTO {
    private Double price;
    private Double last24HoursChange;
    private Long priceTimestamp;
    private Integer fngValue;
    private String valueCertification;
    private Long fngTimestamp;
    private Integer fngTimeUntilUpdate;

    public BitcoinDTO() {
    }

    public BitcoinDTO(Double price, Double last24HoursChange, Long priceTimestamp, Integer fngValue, String valueCertification, Long fngTimestamp, Integer fngTimeUntilUpdate) {
        this.price = price;
        this.last24HoursChange = last24HoursChange;
        this.priceTimestamp = priceTimestamp;
        this.fngValue = fngValue;
        this.valueCertification = valueCertification;
        this.fngTimestamp = fngTimestamp;
        this.fngTimeUntilUpdate = fngTimeUntilUpdate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getLast24HoursChange() {
        return last24HoursChange;
    }

    public void setLast24HoursChange(Double last24HoursChange) {
        this.last24HoursChange = last24HoursChange;
    }

    public Long getPriceTimestamp() {
        return priceTimestamp;
    }

    public void setPriceTimestamp(Long priceTimestamp) {
        this.priceTimestamp = priceTimestamp;
    }

    public Integer getFngValue() {
        return fngValue;
    }

    public void setFngValue(Integer fngValue) {
        this.fngValue = fngValue;
    }

    public String getValueCertification() {
        return valueCertification;
    }

    public void setValueCertification(String valueCertification) {
        this.valueCertification = valueCertification;
    }

    public Long getFngTimestamp() {
        return fngTimestamp;
    }

    public void setFngTimestamp(Long fngTimestamp) {
        this.fngTimestamp = fngTimestamp;
    }

    public Integer getFngTimeUntilUpdate() {
        return fngTimeUntilUpdate;
    }

    public void setFngTimeUntilUpdate(Integer fngTimeUntilUpdate) {
        this.fngTimeUntilUpdate = fngTimeUntilUpdate;
    }

    @Override
    public String toString() {
        return "BitcoinDTO{" +
                "price=" + price +
                ", last24HoursChange=" + last24HoursChange +
                ", priceTimestamp=" + priceTimestamp +
                ", fngValue=" + fngValue +
                ", valueCertification='" + valueCertification + '\'' +
                ", fngTimestamp=" + fngTimestamp +
                ", fngTimeUntilUpdate=" + fngTimeUntilUpdate +
                '}';
    }
}
