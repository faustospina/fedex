package com.es.fedex.adapters.api;

import com.es.fedex.core.dto.PriceDTO;
import com.es.fedex.core.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/prices")
public class PriceController {

    private final PriceService priceService;

    @Autowired
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }
    @GetMapping
    public ResponseEntity<PriceDTO> getPrice(@RequestParam LocalDateTime date,
                                          @RequestParam Long productId,
                                          @RequestParam Long brandId){
        PriceDTO price = priceService.getPrice(productId,brandId,date);
        if (price!=null) {
            return ResponseEntity.ok(price);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public ResponseEntity<List<PriceDTO>> savePrices(@RequestBody List<PriceDTO> prices) {
        priceService.insertPrices(prices);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
