package com.chereshnevvv.syndicate.repositories;

import com.chereshnevvv.syndicate.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByToken(String token);
}
