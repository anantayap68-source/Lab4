package com.example.lab3;

public abstract class Note {
    private String title;
    private String createdDate;

    public Note(String title, String createdDate) {
        this.title = title;
        this.createdDate = createdDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public abstract void getSummary();
}