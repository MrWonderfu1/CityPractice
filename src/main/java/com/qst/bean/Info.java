package com.qst.bean;

import java.util.Date;

public class Info {
    private int id;
    private int type;
    private String title;
    private String linkman;
    private String phone;
    private Date date;
    private String state;
    private String content;
    private String email;
    private String payfor;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPayfor() {
        return payfor;
    }

    public void setPayfor(String payfor) {
        this.payfor = payfor;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", linkman='" + linkman + '\'' +
                ", phone='" + phone + '\'' +
                ", date=" + date +
                ", state='" + state + '\'' +
                ", content='" + content + '\'' +
                ", email='" + email + '\'' +
                ", payfor='" + payfor + '\'' +
                '}';
    }
}