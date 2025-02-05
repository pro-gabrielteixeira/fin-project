package com.personal.fin_project.repositories;

import com.personal.fin_project.entities.BitcoinPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BitcoinPriceRepository extends JpaRepository<BitcoinPriceEntity, Long> {
    Optional<BitcoinPriceEntity> findByTimeStamp(Long timeStamp);
}
