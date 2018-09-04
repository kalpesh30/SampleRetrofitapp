package com.example.kalpesh.retapp1;

import com.google.gson.annotations.SerializedName;

public class Hero {
    @SerializedName("name")
    private String Heroname;
    private String team;
    @SerializedName("firstappearence")
    private String firstAppearence;
    @SerializedName("createdby")
    private String createdBy;
    private String publisher;
    @SerializedName("imageurl")
    private String imageUrl;
    private String bio;

    public Hero(String heroname, String team, String firstAppearence, String createdBy, String publisher, String imageUrl, String bio) {
        Heroname = heroname;
        this.team = team;
        this.firstAppearence = firstAppearence;
        this.createdBy = createdBy;
        this.publisher = publisher;
        this.imageUrl = imageUrl;
        this.bio = bio;
    }

    public String getHeroname() {
        return Heroname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstAppearence() {
        return firstAppearence;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getBio() {
        return bio;
    }
}
