package com.es.fedex.core.services.data;

import com.es.fedex.core.dto.PriceDTO;
import com.es.fedex.core.models.Price;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DataBaseContentService {

    public static List<Price> getData(){
        Price price1 = new Price();
        price1.setBrandId(1);
        price1.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        price1.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price1.setPriceList(1);
        price1.setProductId(35455);
        price1.setPriority(0);
        price1.setPrice(35.50);
        price1.setCurr("EUR");

        Price price2 = new Price();
        price2.setBrandId(1);
        price2.setStartDate(LocalDateTime.of(2020, 6, 14, 15, 0, 0));
        price2.setEndDate(LocalDateTime.of(2020, 6, 14, 18, 30, 0));
        price2.setPriceList(2);
        price2.setProductId(35455);
        price2.setPriority(1);
        price2.setPrice(25.45);
        price2.setCurr("EUR");

        Price price3 = new Price();
        price3.setBrandId(1);
        price3.setStartDate(LocalDateTime.of(2020, 6, 15, 00, 0, 0));
        price3.setEndDate(LocalDateTime.of(2020, 6, 15, 11, 30, 0));
        price3.setPriceList(3);
        price3.setProductId(35455);
        price3.setPriority(1);
        price3.setPrice(30.50);
        price3.setCurr("EUR");

        Price price4 = new Price();
        price4.setBrandId(1);
        price4.setStartDate(LocalDateTime.of(2020, 6, 15, 16, 0, 0));
        price4.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price4.setPriceList(4);
        price4.setProductId(35455);
        price4.setPriority(1);
        price4.setPrice(38.95);
        price4.setCurr("EUR");

        List<Price> prices= new ArrayList<>();
        prices.add(price1);
        prices.add(price2);
        prices.add(price3);
        prices.add(price4);

        return prices;
    }


    public static List<PriceDTO> getDataDto(){
        PriceDTO price1 = new PriceDTO();
        price1.setBrandId(1);
        price1.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        price1.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price1.setPriceList(1);
        price1.setProductId(35455);
        price1.setPriority(0);
        price1.setPrice(35.50);
        price1.setCurr("EUR");

        PriceDTO price2 = new PriceDTO();
        price2.setBrandId(1);
        price2.setStartDate(LocalDateTime.of(2020, 6, 14, 15, 0, 0));
        price2.setEndDate(LocalDateTime.of(2020, 6, 14, 18, 30, 0));
        price2.setPriceList(2);
        price2.setProductId(35455);
        price2.setPriority(1);
        price2.setPrice(25.45);
        price2.setCurr("EUR");

        PriceDTO price3 = new PriceDTO();
        price3.setBrandId(1);
        price3.setStartDate(LocalDateTime.of(2020, 6, 15, 00, 0, 0));
        price3.setEndDate(LocalDateTime.of(2020, 6, 15, 11, 30, 0));
        price3.setPriceList(3);
        price3.setProductId(35455);
        price3.setPriority(1);
        price3.setPrice(30.50);
        price3.setCurr("EUR");

        PriceDTO price4 = new PriceDTO();
        price4.setBrandId(1);
        price4.setStartDate(LocalDateTime.of(2020, 6, 15, 16, 0, 0));
        price4.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price4.setPriceList(4);
        price4.setProductId(35455);
        price4.setPriority(1);
        price4.setPrice(38.95);
        price4.setCurr("EUR");

        List<PriceDTO> prices= new ArrayList<>();
        prices.add(price1);
        prices.add(price2);
        prices.add(price3);
        prices.add(price4);

        return prices;
    }


    public static List<Price> test1(){
        Price price1 = new Price();
        price1.setBrandId(1);
        price1.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        price1.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price1.setPriceList(1);
        price1.setProductId(35455);
        price1.setPriority(0);
        price1.setPrice(35.50);
        price1.setCurr("EUR");

        List<Price> prices= new ArrayList<>();
        prices.add(price1);
        return prices;
    }

    public static PriceDTO test1Dto(){
        PriceDTO price1 = new PriceDTO();
        price1.setBrandId(1);
        price1.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        price1.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price1.setPriceList(1);
        price1.setProductId(35455);
        price1.setPriority(0);
        price1.setPrice(35.50);
        price1.setCurr("EUR");
        return price1;

    }

    public static List<Price> test2(){

        Price price2 = new Price();
        price2.setBrandId(1);
        price2.setStartDate(LocalDateTime.of(2020, 6, 14, 15, 0, 0));
        price2.setEndDate(LocalDateTime.of(2020, 6, 14, 18, 30, 0));
        price2.setPriceList(2);
        price2.setProductId(35455);
        price2.setPriority(1);
        price2.setPrice(25.45);
        price2.setCurr("EUR");

        Price price1 = new Price();
        price1.setBrandId(1);
        price1.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        price1.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price1.setPriceList(1);
        price1.setProductId(35455);
        price1.setPriority(0);
        price1.setPrice(35.50);
        price1.setCurr("EUR");

        List<Price> prices= new ArrayList<>();
        prices.add(price2);
        prices.add(price1);
        return prices;
    }

    public static PriceDTO test2Dto(){
        PriceDTO price2 = new PriceDTO();
        price2.setBrandId(1);
        price2.setStartDate(LocalDateTime.of(2020, 6, 14, 15, 0, 0));
        price2.setEndDate(LocalDateTime.of(2020, 6, 14, 18, 30, 0));
        price2.setPriceList(2);
        price2.setProductId(35455);
        price2.setPriority(1);
        price2.setPrice(25.45);
        price2.setCurr("EUR");
        return price2;

    }

    public static List<Price> test3(){
        Price price1 = new Price();
        price1.setBrandId(1);
        price1.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        price1.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price1.setPriceList(1);
        price1.setProductId(35455);
        price1.setPriority(0);
        price1.setPrice(35.50);
        price1.setCurr("EUR");

        List<Price> prices= new ArrayList<>();
        prices.add(price1);
        return prices;
    }

    public static PriceDTO test3Dto(){
        PriceDTO price1 = new PriceDTO();
        price1.setBrandId(1);
        price1.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        price1.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price1.setPriceList(1);
        price1.setProductId(35455);
        price1.setPriority(0);
        price1.setPrice(35.50);
        price1.setCurr("EUR");
        return price1;

    }

    public static List<Price> test4(){
        Price price3 = new Price();
        price3.setBrandId(1);
        price3.setStartDate(LocalDateTime.of(2020, 6, 15, 00, 0, 0));
        price3.setEndDate(LocalDateTime.of(2020, 6, 15, 11, 30, 0));
        price3.setPriceList(3);
        price3.setProductId(35455);
        price3.setPriority(1);
        price3.setPrice(30.50);
        price3.setCurr("EUR");

        Price price1 = new Price();
        price1.setBrandId(1);
        price1.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        price1.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price1.setPriceList(1);
        price1.setProductId(35455);
        price1.setPriority(0);
        price1.setPrice(35.50);
        price1.setCurr("EUR");

        List<Price> prices= new ArrayList<>();
        prices.add(price3);
        prices.add(price1);
        return prices;
    }

    public static PriceDTO test4Dto(){
        PriceDTO price3 = new PriceDTO();
        price3.setBrandId(1);
        price3.setStartDate(LocalDateTime.of(2020, 6, 15, 00, 0, 0));
        price3.setEndDate(LocalDateTime.of(2020, 6, 15, 11, 30, 0));
        price3.setPriceList(3);
        price3.setProductId(35455);
        price3.setPriority(1);
        price3.setPrice(30.50);
        price3.setCurr("EUR");
        return price3;

    }


    public static List<Price> test5(){
        Price price4 = new Price();
        price4.setBrandId(1);
        price4.setStartDate(LocalDateTime.of(2020, 6, 15, 16, 0, 0));
        price4.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price4.setPriceList(4);
        price4.setProductId(35455);
        price4.setPriority(1);
        price4.setPrice(38.95);
        price4.setCurr("EUR");

        Price price1 = new Price();
        price1.setBrandId(1);
        price1.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0));
        price1.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price1.setPriceList(1);
        price1.setProductId(35455);
        price1.setPriority(0);
        price1.setPrice(35.50);
        price1.setCurr("EUR");

        List<Price> prices= new ArrayList<>();
        prices.add(price4);
        prices.add(price1);
        return prices;
    }

    public static PriceDTO test5Dto(){
        PriceDTO price4 = new PriceDTO();
        price4.setBrandId(1);
        price4.setStartDate(LocalDateTime.of(2020, 6, 15, 16, 0, 0));
        price4.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
        price4.setPriceList(4);
        price4.setProductId(35455);
        price4.setPriority(1);
        price4.setPrice(38.95);
        price4.setCurr("EUR");
        return price4;

    }



}
