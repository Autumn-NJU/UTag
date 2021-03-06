package com.autumn.utag.domain;
/**
 *  方框标注图片的持久类，以图片方框标注的部分为载体
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class TagPart implements Serializable{
    /**
     * id
     */
    @Id
    private int id;

    /**
     * 任务id
     */
    private int taskId;

    /**
     * 图片id
     */
    private String imageID;


    /**
     * 左上角点横坐标
     */
    private double x1;


    /**
     * 右上角点横坐标
     */
    private double x2;


    /**
     * 左上角点纵坐标
     */
    private double y1;


    /**
     * 右上角点纵坐标
     */
    private double y2;


    /**
     * 方框标注描述
     */
    private String description;

    /**
     * 工人
     */
    private String worker;


    public TagPart() {
    }

    public TagPart(String imageID, double x1, double x2, double y1, double y2, String description) {
        this.imageID = imageID;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.description = description;
    }

    public TagPart(double x1, double x2, double y1, double y2, String description) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.description = description;
    }

    public TagPart(String imageID, double x1, double x2, double y1, double y2, String description, String worker) {
        this.imageID = imageID;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.description = description;
        this.worker = worker;
    }

    public TagPart(int id, int taskId, String imageID, double x1, double x2,
                   double y1, double y2, String description, String worker) {
        this.id = id;
        this.taskId = taskId;
        this.imageID = imageID;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.description = description;
        this.worker = worker;
    }

    public TagPart(int taskId, String imageID, double x1, double x2, double y1,
                   double y2, String description, String worker) {
        this.taskId = taskId;
        this.imageID = imageID;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.description = description;
        this.worker = worker;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}
