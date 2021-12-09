package com.cassino.apostas.repository;

import com.cassino.apostas.model.Torneio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TorneioRepository extends MongoRepository<Torneio, Integer>{
}
