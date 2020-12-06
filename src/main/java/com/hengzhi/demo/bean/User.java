package com.hengzhi.demo.bean;

public class User {
    private int id;
    private String username;
    private String sex;

    public User() {
    }

    public User(int id, String username, String sex) {
        this.id = id;
        this.username = username;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
