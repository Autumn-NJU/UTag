package com.autumn.utag.dao;

import com.autumn.utag.domain.User;
import com.autumn.utag.enumeration.UserType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

public class UserDaoTest {
    @Autowired
    private UserDAO userDAO;

    private static final String aStr = "admin";

    @Test
    public void save(){
        User user = new User(aStr, aStr, UserType.Admin);
        System.out.println(userDAO.save(user));
    }
}