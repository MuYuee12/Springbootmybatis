package com.hwadee.springbootmybatis.entity;
import java.util.Date;

public class User {

    private Integer uid;
    private String uaccount;
    private String unickname;
    private String usex;
    private String upassword;
    private String uphone;
    private Date createtime;
    private Date logintime;

    public User(String unickname, String upassword) {
        this.unickname = unickname;
        this.upassword = upassword;
    }

    public User(Integer uid, String unickname, String upassword) {
        this.uid = uid;
        this.unickname = unickname;
        this.upassword = upassword;
    }

    public User(Integer uid) {
        this.uid = uid;
    }

    public User() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount;
    }

    public String getUnickname() {
        return unickname;
    }

    public void setUnickname(String unickname) {
        this.unickname = unickname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }
}
