package com.tut.postgresqlservice.repository;

import com.tut.postgresqlservice.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
