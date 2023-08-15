package com.springframework.springreactivemongo.services;

import com.springframework.springreactivemongo.model.Quote;
import reactor.core.publisher.Flux;

import java.time.Duration;

public interface QuoteGeneratorService {

    Flux<Quote> fetchQuoteStream(Duration period);
}