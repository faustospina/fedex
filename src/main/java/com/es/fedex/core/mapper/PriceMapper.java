package com.es.fedex.core.mapper;

import com.es.fedex.core.dto.PriceDTO;
import com.es.fedex.core.models.Price;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PriceMapper {
    PriceDTO priceToPriceDTO(Price price);
    List<Price> priceDTOsToPrices(List<PriceDTO> priceDTOs);
}
