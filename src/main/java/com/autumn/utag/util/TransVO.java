package com.autumn.utag.util;

import com.autumn.utag.domain.Task;
import com.autumn.utag.domain.User;
import com.autumn.utag.vo.TaskVO;
import com.autumn.utag.vo.UserVO;

/**
 * po to vo 的工厂模式模型
 */
public class TransVO {
    public TransVO(){

    }

    public static TaskVO transTaskVO(Task po){
        TaskVO taskVO = new TaskVO(po.getId(), po.getName(), po.getReward(), po.getRequester(),
                po.getWorkerLimit(), po.getWorkerList(), po.getBeginDate(), po.getDdl(), po.getDescription(),
                po.getProcessMap(), po.getIsFinishedMap(), po.getPictureList(), po.getTagType());
        return taskVO;
    }

    public static UserVO transUserVO(User po){
        UserVO userVO = new UserVO(po.getUsername(), po.getPassword(), po.getCredit(),po.getProperty(),
                po.getLevel(), po.getExperience(), po.getVip(), po.getUserType());
        return userVO;
    }

}
