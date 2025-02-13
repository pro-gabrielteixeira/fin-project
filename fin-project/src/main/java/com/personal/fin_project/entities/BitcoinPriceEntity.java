package com.personal.fin_project.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "bitcoin_price")
public class BitcoinPriceEntity {
    private Double price;
    private Double last24HoursChange;
    private Long timestamp;

    private final LocalDateTime createdAt = LocalDateTime.now();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public BitcoinPriceEntity() {
    }

    public BitcoinPriceEntity(Double price, Double last24HoursChange, Long timestamp) {
        this.price = price;
        this.last24HoursChange = last24HoursChange;
        this.timestamp = timestamp;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
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

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BitcoinPriceEntity that = (BitcoinPriceEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "BitcoinPriceEntity{" +
                "price=" + price +
                ", last24HoursChange=" + last24HoursChange +
                ", timestamp=" + timestamp +
                ", createdAt=" + createdAt +
                ", id=" + id +
                '}';
    }
}
