package com.chatApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class User {
    @Id
    private String emailId;
    private String contactNum;
    private String userName;
    public User(){
        
    }
    public User(String emailId,String contactNum, String userName){
        this.emailId=emailId;
        this.contactNum=contactNum;
        this.userName=userName;
    }
    public String getEmail(){
        return this.emailId;
    }
    public String getContactNum(){
        return this.contactNum;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String newUserName){
        this.userName=newUserName;
    }
}
