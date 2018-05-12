package com.autumn.utag.service.Impl;

import com.autumn.utag.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void getWorkerNum() {
        int n = userService.getWorkerNum().getData();
        assertEquals(2, n);
    }

    @Test
    public void getRank() {
        int n = userService.getRank("py").getData();
        assertEquals(1, n);
    }
}