package br.com.ListaPresentes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.ListaPresentes.domain.Gift;

@Repository
public interface GiftRepository extends MongoRepository<Gift, String> {

}
