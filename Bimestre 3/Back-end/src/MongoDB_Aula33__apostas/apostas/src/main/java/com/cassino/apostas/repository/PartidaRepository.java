package com.cassino.apostas.repository;

import com.cassino.apostas.model.Partida;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartidaRepository extends MongoRepository<Partida, Integer> {
}
