package com.mod.Entity;

import javax.persistence.*;

@Entity
@Table(name = "user_entity")
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer user_id;
    private String user_name;
    private String user_phone;
    private String userEmail;


    public UserEntity() {
    }

    public UserEntity(String user_name, String user_phone, String userEmail) {
        this.user_name = user_name;
        this.user_phone = user_phone;
        this.userEmail = userEmail;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
