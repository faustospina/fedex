package com.es.fedex.core.services;

import com.es.fedex.core.dto.PriceDTO;
import com.es.fedex.core.exceptions.FedexException;
import com.es.fedex.core.mapper.PriceMapper;
import com.es.fedex.core.models.Price;
import com.es.fedex.core.repositories.PriceRepository;
import com.es.fedex.core.services.data.DataBaseContentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class PriceServiceImplTest {

    @Mock
    private PriceRepository repository;

    @Mock
    private PriceMapper mapper;

    @InjectMocks
    private PriceServiceImpl service;

    public List<Price> data = DataBaseContentService.getData();
    public List<PriceDTO> dataDto = DataBaseContentService.getDataDto();

    public List<Price> test1 = DataBaseContentService.test1();
    public PriceDTO test1Dto = DataBaseContentService.test1Dto();

    public List<Price> test2 = DataBaseContentService.test2();
    public PriceDTO test2Dto = DataBaseContentService.test2Dto();

    public List<Price> test3 = DataBaseContentService.test3();
    public PriceDTO test3Dto = DataBaseContentService.test3Dto();

    public List<Price> test4 = DataBaseContentService.test4();
    public PriceDTO test4Dto = DataBaseContentService.test4Dto();

    public List<Price> test5 = DataBaseContentService.test5();
    public PriceDTO test5Dto = DataBaseContentService.test5Dto();

    @Test
    public void getPriceTest1() {
        Mockito.when(repository.findPrice(Mockito.any(),Mockito.any(),Mockito.any())).thenReturn(test1);
        Mockito.when(mapper.priceToPriceDTO(Mockito.any())).thenReturn(test1Dto);
        PriceDTO temp = service.getPrice(Long.valueOf(1),Long.valueOf(35455), LocalDateTime.of(2020, 6, 14, 10, 0, 0));
        Assert.assertNotNull(temp);
        Assert.assertTrue(temp.getPrice()==35.5);
    }

    @Test
    public void getPriceTest2() {
        Mockito.when(repository.findPrice(Mockito.any(),Mockito.any(),Mockito.any())).thenReturn(test2);
        Mockito.when(mapper.priceToPriceDTO(Mockito.any())).thenReturn(test2Dto);
        PriceDTO temp = service.getPrice(Long.valueOf(1),Long.valueOf(35455),LocalDateTime.of(2020, 6, 14, 16, 0, 0));
        Assert.assertNotNull(temp);
        Assert.assertTrue(temp.getPrice()==25.45);
    }

    @Test
    public void getPriceTest3() {
        Mockito.when(repository.findPrice(Mockito.any(),Mockito.any(),Mockito.any())).thenReturn(test3);
        Mockito.when(mapper.priceToPriceDTO(Mockito.any())).thenReturn(test3Dto);
        PriceDTO temp = service.getPrice(Long.valueOf(1),Long.valueOf(35455),LocalDateTime.of(2020, 6, 14, 21, 0, 0));
        Assert.assertNotNull(temp);
        Assert.assertTrue(temp.getPrice()==35.5);
    }

    @Test
    public void getPriceTest4() {
        Mockito.when(repository.findPrice(Mockito.any(),Mockito.any(),Mockito.any())).thenReturn(test4);
        Mockito.when(mapper.priceToPriceDTO(Mockito.any())).thenReturn(test4Dto);
        PriceDTO temp = service.getPrice(Long.valueOf(1),Long.valueOf(35455),LocalDateTime.of(2020, 6, 15, 10, 0, 0));
        Assert.assertNotNull(temp);
        Assert.assertTrue(temp.getPrice()==30.5);
    }

    @Test
    public void getPriceTest5() {
        Mockito.when(repository.findPrice(Mockito.any(),Mockito.any(),Mockito.any())).thenReturn(test5);
        Mockito.when(mapper.priceToPriceDTO(Mockito.any())).thenReturn(test5Dto);
        PriceDTO temp = service.getPrice(Long.valueOf(1),Long.valueOf(35455),LocalDateTime.of(2020, 6, 16, 21, 0, 0));
        Assert.assertNotNull(temp);
        Assert.assertTrue(temp.getPrice()==38.95);
    }

    @Test
    public void getPriceException() {
        Mockito.when(repository.findPrice(Mockito.any(),Mockito.any(),Mockito.any())).thenReturn(new ArrayList<>());
        try{
            service.getPrice(Long.valueOf(1),Long.valueOf(35455),LocalDateTime.of(2020, 6, 16, 21, 0, 0));
        }catch (FedexException e){
            Assert.assertNotNull(e);
        }

    }

    @Test
    public void insertPrices() {
        Mockito.when(mapper.priceDTOsToPrices(dataDto)).thenReturn(data);
        service.insertPrices(dataDto);
        Mockito.verify(repository, Mockito.times(1))
                .saveAll(data);
    }

}