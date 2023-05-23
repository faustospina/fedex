package com.es.fedex.core.repositories;

import com.es.fedex.core.models.Price;
import com.es.fedex.core.repositories.data.DataBaseContent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PriceRepositoryTest {


    @Autowired
    private PriceRepository repository;


    public List<Price> data = DataBaseContent.getData();

    @Test
    public void price_when_14_10() {
        repository.saveAll(data);
        List<Price> pricesOut = repository.findPrice(Long.valueOf(1),Long.valueOf(35455),LocalDateTime.of(2020, 6, 14, 10, 0, 0));
        Assert.assertNotNull(pricesOut);
        Assert.assertTrue(pricesOut.get(0).getPrice()==35.5);
    }

    @Test
    public void price_when_14_16() {
        repository.saveAll(data);
        List<Price> pricesOut = repository.findPrice(Long.valueOf(1),Long.valueOf(35455),LocalDateTime.of(2020, 6, 14, 16, 0, 0));
        Assert.assertNotNull(pricesOut);
        Assert.assertTrue(pricesOut.get(0).getPrice()==25.45);
    }

    @Test
    public void price_when_14_21() {
        repository.saveAll(data);
        List<Price> pricesOut = repository.findPrice(Long.valueOf(1),Long.valueOf(35455),LocalDateTime.of(2020, 6, 14, 21, 0, 0));
        Assert.assertNotNull(pricesOut);
        Assert.assertTrue(pricesOut.get(0).getPrice()==35.5);
    }

    @Test
    public void price_when_15_10() {
        repository.saveAll(data);
        List<Price> pricesOut = repository.findPrice(Long.valueOf(1),Long.valueOf(35455),LocalDateTime.of(2020, 6, 15, 10, 0, 0));
        Assert.assertNotNull(pricesOut);
        Assert.assertTrue(pricesOut.get(0).getPrice()==30.5);
    }

    @Test
    public void price_when_16_21() {
        repository.saveAll(data);
        List<Price> pricesOut = repository.findPrice(Long.valueOf(1),Long.valueOf(35455),LocalDateTime.of(2020, 6, 16, 21, 0, 0));
        Assert.assertNotNull(pricesOut);
        Assert.assertTrue(pricesOut.get(0).getPrice()==38.95);
    }
}