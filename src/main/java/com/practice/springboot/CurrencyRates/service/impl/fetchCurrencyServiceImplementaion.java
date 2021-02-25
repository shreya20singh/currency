package com.practice.springboot.CurrencyRates.service.impl;

import com.practice.springboot.CurrencyRates.model.Currency;
import com.practice.springboot.CurrencyRates.service.FetchCurrencyRatesService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;
import java.util.Map;

@Service
public class fetchCurrencyServiceImplementaion implements FetchCurrencyRatesService {

    Map<String,Currency> currencyMap;
    String accessKey = "8f9ff5107e7c98b0c980649e336bca1e";
    String url = "http://data.fixer.io/api/latest?access_key="+accessKey;

    @Override
    public Currency fetchCurrencyRates() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        return null;
    }
}
