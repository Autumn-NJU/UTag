package com.autumn.utag.dao;

import com.autumn.utag.domain.User;
import com.autumn.utag.enumeration.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends JpaRepository<User, String>{
    /**
     * 由索引规定是String
     * @param userType
     * @return
     */
    @Query(value = "select * from user u where u.user_type=?1 ORDER BY property DESC ", nativeQuery = true)
    List<User> listUserByType(String userType);

}
