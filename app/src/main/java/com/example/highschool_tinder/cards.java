package com.example.highschool_tinder;

public class cards {
    private String userId;
    private String name;
    private String profileImageUrl;
    public cards (String userId, String name, String profileImageUrl){
        this.userId = userId;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
    }
    public String getUserId(){
        return userId;
    }
    public String getName(){
        return name;
    }
    public String getProfileImageUrl()
    {
        return profileImageUrl;
    }


    public void setUserId(String userId){
        this.userId = userId;
    }
    public void  setName(String name){
        this.name = name;
    }
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
