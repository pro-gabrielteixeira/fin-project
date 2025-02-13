package com.personal.fin_project.repositories;

import com.personal.fin_project.entities.BitcoinFearAndGreedEntity;
import com.personal.fin_project.entities.BitcoinPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BitcoinFearAndGreedRepository extends JpaRepository<BitcoinFearAndGreedEntity, Long> {
    Optional<BitcoinFearAndGreedEntity> findByTimestamp(Long timestamp);
}
