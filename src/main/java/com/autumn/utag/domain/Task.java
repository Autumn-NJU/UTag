package com.autumn.utag.domain;

import com.autumn.utag.enumeration.*;
import sun.tools.jconsole.Worker;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Entity
public class Task implements Serializable{
    /**
     * 任务id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * 任务名
     */
    private String name;

    /**
     * 任务中图片路径和对应奖励
     */
    private double reward;

    /**
     * 发布者
     */
    private String requester;

    /**
     * 工人人数
     */
    private int workerLimit;

    /**
     * 接受者
     */
    @ElementCollection
    private List<String> workerList;

    /**
     * 日期
     */
    private String beginDate;

    /**
     * 截止日期
     */
    private String ddl;

    /**
     * 描述
     */
    private String description;

    /**
     * 完成进程
     * 以字符串 工人名:double的形式返回
     */
    @ElementCollection

    private List<String> processMap;

    /**
     * 是否完成
     * 以字符串 工人名:boolean的形式返回
     */
    @ElementCollection
    private List<String> isFinishedMap;

    /**
     * 标注图片集，仅以图片名称作为list
     */
    @ElementCollection
    private List<String> pictureList;


    /**
     * 标注类型
     */
    private TagType tagType;

    public Task() {
    }

    public Task(String name, double reward, String requester,
                int workerLimit, List<String> workerList, String beginDate,
                String ddl, String description, List<String> processMap,
                List<String> isFinishedMap, List<String> pictureList, TagType tagType) {
        this.name = name;
        this.reward = reward;
        this.requester = requester;
        this.workerLimit = workerLimit;
        this.workerList = workerList;
        this.beginDate = beginDate;
        this.ddl = ddl;
        this.description = description;
        this.processMap = processMap;
        this.isFinishedMap = isFinishedMap;
        this.pictureList = pictureList;
        this.tagType = tagType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public int getWorkerLimit() {
        return workerLimit;
    }

    public void setWorkerLimit(int workerLimit) {
        this.workerLimit = workerLimit;
    }

    public List<String> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<String> workerList) {
        this.workerList = workerList;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getDdl() {
        return ddl;
    }

    public void setDdl(String ddl) {
        this.ddl = ddl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getProcessMap() {
        return processMap;
    }

    public void setProcessMap(List<String> processMap) {
        this.processMap = processMap;
    }

    public List<String> getIsFinishedMap() {
        return isFinishedMap;
    }

    public void setIsFinishedMap(List<String> isFinishedMap) {
        this.isFinishedMap = isFinishedMap;
    }

    public List<String> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<String> pictureList) {
        this.pictureList = pictureList;
    }

    public TagType getTagType() {
        return tagType;
    }

    public void setTagType(TagType tagType) {
        this.tagType = tagType;
    }
}
