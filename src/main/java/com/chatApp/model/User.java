package com.chatApp.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private String emailId;

    private String contactNum;

    private String userName;

    private List<User> contacts;

    public User() {
    }

    public User(String emailId, String contactNum, String userName, List<User> contacts) {
        this.emailId = emailId;
        this.contactNum = contactNum;
        this.userName = userName;
        this.contacts = contacts;
    }

    public String getContactNum() {
        return contactNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public List<User> getContacts() {
        return contacts;
    }

    public void setContacts(List<User> contacts) {
        this.contacts = contacts;
    }
}
