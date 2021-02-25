package com.practice.springboot.CurrencyRates.controller;

import com.practice.springboot.CurrencyRates.model.Currency;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("currencies")
public class CurrenciesController {

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Currency> getCurrency(){
        Currency currency = new Currency();
        currency.setName("INR");
        currency.setRate("70");

        return new ResponseEntity<Currency>(currency,HttpStatus.OK);
    }

}
