package com.es.fedex.adapters.api;

import com.es.fedex.core.dto.PriceDTO;
import com.es.fedex.core.services.PriceService;
import com.es.fedex.core.services.data.DataBaseContentService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PriceControllerTest {

    @Mock
    private PriceService priceService;

    @InjectMocks
    private PriceController priceController;


    public List<PriceDTO> dataDto = DataBaseContentService.getDataDto();

    @Test
    public void testGetPrice_PriceFound() {
        LocalDateTime date = LocalDateTime.now();
        Long productId = 1L;
        Long brandId = 1L;

        PriceDTO price4 = new PriceDTO();
        price4.setBrandId(1);
        price4.setStartDate(LocalDateTime.of(2020, 6, 15, 16, 0, 0));
        price4.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price4.setPriceList(4);
        price4.setProductId(35455);
        price4.setPriority(1);
        price4.setPrice(38.95);
        price4.setCurr("EUR");
        Mockito.when(priceService.getPrice(Mockito.any(),Mockito.any(),Mockito.any())).thenReturn(price4);
        ResponseEntity<PriceDTO> response = priceController.getPrice(date, productId, brandId);
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertEquals(price4, response.getBody());
    }

    @Test
    public void testGetPrice_PriceNotFound() {
        LocalDateTime date = LocalDateTime.now();
        Long productId = 1L;
        Long brandId = 1L;

        Mockito.when(priceService.getPrice(productId, brandId, date)).thenReturn(null);
        ResponseEntity<PriceDTO> response = priceController.getPrice(date, productId, brandId);
        Assert.assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        Assert.assertNull(response.getBody());
    }

    @Test
    public void testSavePrices_Success() {
        ResponseEntity<List<PriceDTO>> response = priceController.savePrices(dataDto);
        Mockito.verify(priceService, Mockito.times(1)).insertPrices(dataDto);
        Assert.assertEquals(HttpStatus.CREATED, response.getStatusCode());
        Assert.assertNull(response.getBody());
    }
}