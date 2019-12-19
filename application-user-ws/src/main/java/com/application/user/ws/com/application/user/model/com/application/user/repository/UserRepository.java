package com.application.user.ws.com.application.user.model.com.application.user.repository;

import com.application.user.ws.com.application.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
