package com.autumn.utag.service.Impl;

import com.autumn.utag.dao.UserDAO;
import com.autumn.utag.domain.User;
import com.autumn.utag.enumeration.UserType;
import com.autumn.utag.service.UserService;
import com.autumn.utag.util.Response;
import com.autumn.utag.util.SortUtil;
import com.autumn.utag.util.TransVO;
import com.autumn.utag.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    @Override
    public Response<Boolean> saveUser(String user, String password, UserType userType)  {
        User user1 = new User(user, password, userType);
        try{
            userDAO.save(user1);
            return new Response<>(true, "Succeed to save user!");
        }catch (Exception ex){
            ex.printStackTrace();
            return new Response<>(false, "Fail to save user!");
        }
    }

    @Override
    public Response<Boolean> deleteUser(String user) {
        User user1 = new User();
        user1.setUsername(user);
        try{
            userDAO.delete(user1);
            return new Response<>(true, "Succeed to delete user!");
        }catch (Exception ex){
            ex.printStackTrace();
            return new Response<>(false, "Fail to delete user!");
        }
    }



    @Override
    public Response<Boolean> canLogin(String user, String password) {
        try{
            User user1 = userDAO.getOne(user);
            if(user1.getPassword().equals(password))
                return new Response<>(true, "Succeed to login");
            else
                return new Response<>(false, "Password wrong!");
        }catch (Exception ex){
            ex.printStackTrace();
            return new Response<>(false, "Fail to login...");
        }
    }

    @Override
    public Response<List<UserVO>> listUser() {
        List<UserVO> userVOList = new ArrayList<>();
        try {
            List<User> userList = userDAO.findAll();
            for(User u: userList){
                userVOList.add(TransVO.transUserVO(u));
            }
            return new Response<>(true, userVOList, "Succeed to list user!");
        }catch (Exception ex){
            ex.printStackTrace();
            return new Response<>(false, "Fail to list user!");
        }
    }

    @Override
    public Response<Integer> getWorkerNum() {
        try {
            int workerNum = userDAO.listUserByType(UserType.Worker.toString()).size();
            return new Response<>(true, workerNum, "Succeed to list worker");
        }catch (Exception ex){
            ex.printStackTrace();
            return new Response<>(false, "Fail to list worker!");

        }    }

    @Override
    public Response<Integer> getRequesterNum() {
        try {
            int requesterNum = userDAO.listUserByType(UserType.Requester.toString()).size();
            return new Response<>(true, requesterNum, "Succeed to list requester!");
        }catch (Exception ex){
            ex.printStackTrace();
            return new Response<>(false, "Fail to list requester!");
        }
    }

    @Override
    public Response<UserVO> getUserByName(String userName) {
        try{
            User user = userDAO.getOne(userName);
            UserVO userVO = TransVO.transUserVO(user);
            return new Response<>(true, userVO, "Succeed to get user!");
        }catch (Exception ex){
            ex.printStackTrace();
            return new Response<>(false, "Fail to get user!");
        }
    }

    @Override
    public Response<Integer> getRank(String worker) {
        try {
            User user = userDAO.getOne(worker);
            List<User> list = userDAO.listUserByType(UserType.Worker.toString());
            int rank = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getUsername().equals(worker)) {
                    rank = i + 1;
                    break;
                }
            }
            return new Response<>(true, rank, "Succeed to get rank!");
        }catch (Exception ex){
            ex.printStackTrace();
            return new Response<>(false, "Fail to get rank!");
        }
    }
}
