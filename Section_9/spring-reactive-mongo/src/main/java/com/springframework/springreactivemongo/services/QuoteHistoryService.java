package com.springframework.springreactivemongo.services;

import com.springframework.springreactivemongo.domain.QuoteHistory;
import com.springframework.springreactivemongo.model.Quote;
import reactor.core.publisher.Mono;

public interface QuoteHistoryService {

    Mono<QuoteHistory> saveQuoteToMongo(Quote quote);
}
