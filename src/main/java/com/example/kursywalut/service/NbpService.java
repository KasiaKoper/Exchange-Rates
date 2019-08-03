package com.example.kursywalut.service;

import com.example.kursywalut.model.Currency;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbpService implements CurrencyService {


    @Override
    public Currency getCurrency(String currency) {

        String apiPath="http://api.nbp.pl/api/exchangerates/rates/c/" + currency + "?format=json";
         return new RestTemplate().getForObject(apiPath,Currency.class);     //zamienia jsona na obiekty wskazanej klasy

    }

    public Double result(String currency, Double amount){
//        return amount/currency.rates;
        return 0.00;
    }

}
