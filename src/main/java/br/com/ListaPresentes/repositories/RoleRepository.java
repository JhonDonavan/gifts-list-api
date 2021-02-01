package br.com.ListaPresentes.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ListaPresentes.model.ERole;
import br.com.ListaPresentes.model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
	  Optional<Role> findByName(ERole name);
}
