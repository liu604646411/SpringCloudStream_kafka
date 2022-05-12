package com.springcloudstream.producer;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserPojo implements Serializable {
    private String id;
    private String name;
    private Timestamp birth;

    public UserPojo() {
    }

    public UserPojo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getBirth() {
        return birth;
    }

    public void setBirth(Timestamp birth) {
        this.birth = birth;
    }
}
