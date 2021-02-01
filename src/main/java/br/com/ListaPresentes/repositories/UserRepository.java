package br.com.ListaPresentes.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ListaPresentes.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

	Optional<?> findByUsername(String username);

}
