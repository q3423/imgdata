package com.lw.imgdata.pojo.json;

/**
 * Created by asus on 2018/1/17.
 */
public class User {

    private String name;
    private Long id;
    private Long time;
    private Integer state;
    private String account;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    public User() {
        super();
    }

    public User(String name, Long id, Long time, Integer state, String account) {
        this.name = name;
        this.id = id;
        this.time = time;
        this.state = state;
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", time=" + time +
                ", state=" + state +
                ", account='" + account + '\'' +
                '}';
    }
}
