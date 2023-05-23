package com.es.fedex.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class PriceDTO {
    private int priceList;
    private int brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int productId;
    private int priority;
    private double price;
    private String curr;
}
