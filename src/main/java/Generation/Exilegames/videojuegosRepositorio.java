package Generation.Exilegames;

import org.springframework.data.repository.CrudRepository;

import Generation.Exilegames.videojuegos;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface videojuegosRepositorio extends CrudRepository<videojuegos, Integer> {

}