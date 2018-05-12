package com.autumn.utag.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 单个图片的领域类模型
 */
@Entity
public class Picture implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    /**
     * 任务id
     */
    private int taskID;

    /**
     * 图片名称
     */
    private String imageID;

    /**
     * 工人
     */
    private String worker;

    /**
     * 是否标注
     */
    private boolean isTagged;

    public Picture() {
    }

    public Picture(int taskID, String imageID, String worker) {
        this.taskID = taskID;
        this.imageID = imageID;
        this.worker = worker;
        this.id = taskID + "-" + worker + "-" + imageID;
        this.isTagged = false;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isTagged() {
        return isTagged;
    }

    public void setTagged(boolean tagged) {
        isTagged = tagged;
    }
}
