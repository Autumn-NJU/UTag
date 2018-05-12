package com.autumn.utag.dao;

import com.autumn.utag.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, String>{

}
