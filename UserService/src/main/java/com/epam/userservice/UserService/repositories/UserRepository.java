package com.epam.userservice.UserService.repositories;

import com.epam.userservice.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    // for custom query, you can add query here
}
