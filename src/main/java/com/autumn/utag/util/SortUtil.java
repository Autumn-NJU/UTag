package com.autumn.utag.util;

public class SortUtil {
    //排序方式
    private String orderType;

    //排序字段
    private String orderField;

    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public SortUtil(String orderType, String orderField) {
        this.orderType = orderType;
        this.orderField = orderField;
    }

    //默认为DESC排序
    public SortUtil(String orderField) {
        this.orderField = orderField;
        this.orderType = "desc";
    }
}
