package com.es.fedex.core.services;

import com.es.fedex.core.dto.PriceDTO;
import com.es.fedex.core.exceptions.FedexException;
import com.es.fedex.core.mapper.PriceMapper;
import com.es.fedex.core.models.Price;
import com.es.fedex.core.repositories.PriceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class PriceServiceImpl implements PriceService{

    private final PriceRepository priceRepository;
    private final PriceMapper priceMapper;

    @Override
    public PriceDTO getPrice( Long productId, Long brandId,LocalDateTime date) {
        List<Price> prices = priceRepository.findPrice(brandId,productId,date);
        if (prices==null||prices.isEmpty()) {
            throw new FedexException("No se encontró el precio para el brandId: " + brandId + " y productId: " + productId);
        }
        return priceMapper.priceToPriceDTO(prices.get(0));
    }


    public void insertPrices(List<PriceDTO> priceDTOs) {
        List<Price> prices = priceMapper.priceDTOsToPrices(priceDTOs);
        priceRepository.saveAll(prices);
    }
}
