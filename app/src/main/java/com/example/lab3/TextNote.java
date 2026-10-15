package com.example.lab3;

public class TextNote extends Note {
    private String content;

    public TextNote(String title, String content, String createdDate) {
        super(title, createdDate);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void getSummary() {
        System.out.println(getTitle() + " : " + content + " (" + getCreatedDate() + ")");
    }
}