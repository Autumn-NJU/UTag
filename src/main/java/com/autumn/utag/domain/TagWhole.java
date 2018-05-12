package com.autumn.utag.domain;

/**
 * 整张图片标注的持久类
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class TagWhole implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    /**
     * 任务id
     */
    private int taskId;

    /**
     *照片id
     */
    private String imageID;


    /**
     *标注描述
     */
    private String description;

    /**
     * 工人名
     */
    private String worker;

    public TagWhole() {
    }




    public TagWhole(String imageID, String description) {
        this.imageID = imageID;
        this.description = description;
    }

    public TagWhole(String imageID, String description, String worker) {
        this.imageID = imageID;
        this.description = description;
        this.worker = worker;
    }


    public TagWhole(int taskId, String imageID, String description, String worker) {
        this.taskId = taskId;
        this.imageID = imageID;
        this.description = description;
        this.worker = worker;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }
}
