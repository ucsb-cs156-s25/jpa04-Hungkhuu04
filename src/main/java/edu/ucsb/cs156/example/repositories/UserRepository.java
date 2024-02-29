package edu.ucsb.cs156.example.repositories;

import edu.ucsb.cs156.example.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * The UserRepository is a repository for User entities.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  Optional<User> findByEmail(String email);
}
