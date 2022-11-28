package co.edu.icesi.JCStore.repository;

import co.edu.icesi.JCStore.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<UserDTO, UUID> { }
