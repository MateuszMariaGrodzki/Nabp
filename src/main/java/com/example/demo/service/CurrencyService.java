package com.example.demo.service;

import com.example.demo.model.Currency;
import org.springframework.stereotype.Service;

public interface CurrencyService {
    Currency getCurrency(String currency);
}
