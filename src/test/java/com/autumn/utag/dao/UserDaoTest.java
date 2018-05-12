package com.autumn.utag.dao;

import com.autumn.utag.domain.User;
import com.autumn.utag.enumeration.UserType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

public class UserDaoTest {

    @Autowired
    private UserDAO userDAO;

    private static final String aStr = "admin", pyStr = "py", pxyStr = "pyx", pw = "123";


    @Test
    public void save(){
        User user = new User(aStr, aStr);
        userDAO.save(user);
        User user1 = new User(pyStr, pw, UserType.Worker);
        userDAO.save(user1);
        User user2 = new User(pxyStr, pw, UserType.Worker);
        userDAO.save(user2);
    }


    @Test
    @Transactional
    public void delete(){
        User user = new User();
        user.setUsername(aStr);
        userDAO.delete(user);
    }

    @Test
    @Transactional
    public void find(){

        User user = userDAO.getOne(aStr);
        if(user == null) {
            System.out.println("///");
        } else {
            assertEquals(aStr, user.getPassword());
           // assertEquals(100.0, user.getProperty());
            System.out.println(user.getProperty());
        }
    }

    @Test
    @Transactional
    public void listUserByType(){
        List<User> userList = userDAO.listUserByType(UserType.Admin.toString());
        assertEquals(1, userList.size());
        userList = userDAO.listUserByType(UserType.Worker.toString());
        assertEquals(2, userList.size());
        userList = userDAO.listUserByType(UserType.Requester.toString());
        assertEquals(0, userList.size());
    }
}