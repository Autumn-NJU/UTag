package com.autumn.utag.service;



import com.autumn.utag.enumeration.UserType;
import com.autumn.utag.util.Response;
import com.autumn.utag.vo.UserVO;

import java.util.List;

/**
 * 所谓对用户的CURD
 */
public interface UserService {
    /**
     *所以增加
     * @return
     */
    Response<Boolean> saveUser(String user, String password, UserType userType);


    /**
     * 所谓删除
     * @return
     */
    Response<Boolean> deleteUser(String user);


    /**
     *
     * @return
     */
    Response<Boolean> canLogin(String user, String password);


    /**
     * 获取用户列表
     * @return
     */
    Response<List<UserVO>> listUser();

    /**
     * 得到工人数
     * @return
     */
    Response<Integer> getWorkerNum();

    /**
     * 得到发布者数
     * @return
     */
    Response<Integer> getRequesterNum();

    /**
     * 根据用户名返回用户信息
     * @param userName
     * @return
     */
    Response<UserVO> getUserByName(String userName);


    Response<Integer> getRank(String worker);
}
