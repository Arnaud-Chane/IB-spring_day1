package com.springboot.bookstore.repository.user;

import com.springboot.bookstore.model.user.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
}
