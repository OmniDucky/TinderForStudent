package com.example.highschool_tinder;

public class cards {
    private String userId;
    private String name;
    public cards (String userId, String name){
        this.userId = userId;
        this.name = name;
    }
    public String getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }
    public void  setName(String name){
        this.name = name;
    }
}
