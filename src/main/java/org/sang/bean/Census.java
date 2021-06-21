package org.sang.bean;

import java.sql.Timestamp;

public class Census {
    private Long likesNum;
    private Long aid;
    private Long likes;

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public Long getLikesNum() {
        return likesNum;
    }

    public void setLikesNum(Long likesNum) {
        this.likesNum = likesNum;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    private String cateName;

}
