package org.sang.bean;

import java.sql.Timestamp;

/**
 * Created by albert on 2019/12/20.
 */
public class Category {

    private Long id;

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    private Long state;
    private String cateName;
    private Timestamp date;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    private Long uid;

    public Category() {
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }
}
