package com.aula34.integradoraix.repositories;


import com.aula34.integradoraix.entity.Pacote;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacoteRepository extends MongoRepository<Pacote, String> {
}
