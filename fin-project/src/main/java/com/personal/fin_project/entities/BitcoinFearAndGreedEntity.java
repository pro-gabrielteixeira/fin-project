package com.personal.fin_project.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "bitcoin_fng")
public class BitcoinFearAndGreedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fng_value")
    private Integer value;

    private String valueCertification;
    private Long timestamp;
    private Integer timeUntilUpdate;

    public BitcoinFearAndGreedEntity() {
    }

    public BitcoinFearAndGreedEntity(Integer value, String valueCertification, Long timestamp, Integer timeUntilUpdate) {
        this.value = value;
        this.valueCertification = valueCertification;
        this.timestamp = timestamp;
        this.timeUntilUpdate = timeUntilUpdate;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getValueCertification() {
        return valueCertification;
    }

    public void setValueCertification(String valueCertification) {
        this.valueCertification = valueCertification;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getTimeUntilUpdate() {
        return timeUntilUpdate;
    }

    public void setTimeUntilUpdate(Integer timeUntilUpdate) {
        this.timeUntilUpdate = timeUntilUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BitcoinFearAndGreedEntity that = (BitcoinFearAndGreedEntity) o;
        return Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(timestamp);
    }

    @Override
    public String toString() {
        return "BitcoinFearAndGreedEntity{" +
                "value=" + value +
                ", valueCertification='" + valueCertification + '\'' +
                ", timestamp=" + timestamp +
                ", timeUntilUpdate=" + timeUntilUpdate +
                '}';
    }
}
