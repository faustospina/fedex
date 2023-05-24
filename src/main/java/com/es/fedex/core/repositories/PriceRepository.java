package com.es.fedex.core.repositories;
import com.es.fedex.core.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    @Query("SELECT p FROM Price p " +
            "WHERE p.brandId = :brandId AND p.productId = :productId " +
            "AND :date BETWEEN p.startDate AND p.endDate " +
            "ORDER BY p.priority DESC" )
    List<Price> findPrice(
            Long brandId, Long productId, LocalDateTime date);

}
