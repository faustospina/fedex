package com.es.fedex.core.services;

import com.es.fedex.core.dto.PriceDTO;
import com.es.fedex.core.models.Price;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceService {

    PriceDTO getPrice(Long productId,Long brandId,LocalDateTime date);

    void insertPrices(List<PriceDTO> priceDTOs);
}
