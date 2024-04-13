package com.example.sanchisandroidproject;

public class Project {
    String name = "";
    String description = "";
    int image;
    //R.drawable.name_of_the_file(This will be a sort of number)
    //e,g 8234923480

    public Project(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }
}
