package br.com.ListaPresentes.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ListaPresentes.domain.ERole;
import br.com.ListaPresentes.domain.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
	  Optional<Role> findByName(ERole name);
}
