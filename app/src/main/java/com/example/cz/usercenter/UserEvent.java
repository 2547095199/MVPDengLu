package com.example.cz.usercenter;

/**
 * Created by CZ on 2018/1/10.
 */

public class UserEvent {
    private String uid;

    public UserEvent(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "UserEvent{" +
                "uid='" + uid + '\'' +
                '}';
    }
}
