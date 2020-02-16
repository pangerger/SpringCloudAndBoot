package com.pan.model.entity;

import java.util.Date;

public class User {
    private Date date;
    private Long id;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "date=" + date +
                ", id=" + id +
                '}';
    }
}
