package Generation.Exilegames;

import org.springframework.data.repository.CrudRepository;

import Generation.Exilegames.usuarios;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface usuariosRepositorio extends CrudRepository<usuarios, Integer> {

}
