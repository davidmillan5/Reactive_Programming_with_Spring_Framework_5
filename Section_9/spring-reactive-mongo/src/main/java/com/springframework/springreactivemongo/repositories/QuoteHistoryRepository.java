package com.springframework.springreactivemongo.repositories;

import com.springframework.springreactivemongo.domain.QuoteHistory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface QuoteHistoryRepository extends ReactiveMongoRepository<QuoteHistory,String> {
}
