package com.example.lab3;

public abstract class Note {
    private String title;
    private String createdDate;
    private User user;

    public Note(String title, String createdDate, User user) {
        this.title = title;
        this.createdDate = createdDate;
        this.user = user;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public abstract void getSummary();
}