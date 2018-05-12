package com.autumn.utag.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
@Entity
public class Area implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     *
     */
    private int taskId;

    /*
     * 照片id
     */
    private String imageId;

    /**
     * 工人
     */
    private String worker;

    /**
     * 标注
     * 以标注区域字符串:标注字符串
     */
    @ElementCollection
    private List<String> tagMap;

    public Area() {
    }

    public Area(int taskId, String imageId, String worker, List<String> tagMap) {
        this.taskId = taskId;
        this.imageId = imageId;
        this.worker = worker;
        this.tagMap = tagMap;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
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

    public List<String> getTagMap() {
        return tagMap;
    }

    public void setTagMap(List<String> tagMap) {
        this.tagMap = tagMap;
    }
}
