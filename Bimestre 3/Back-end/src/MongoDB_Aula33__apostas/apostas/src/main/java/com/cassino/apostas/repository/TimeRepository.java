package com.cassino.apostas.repository;

import com.cassino.apostas.model.Time;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TimeRepository extends MongoRepository<Time, Integer> {
}
