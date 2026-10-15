package com.example.lab3;

public class TextNote extends Note {
    private String content;

    public TextNote(String title, String content, String createdDate, User user) {
        super(title, createdDate, user);
        this.content = content;
    }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    @Override
    public void getSummary() {
        String owner = (getUser() != null) ? getUser().getUserName() : "Unknown";
        System.out.println("[" + owner + "] " + getTitle() + " : " + content + " (" + getCreatedDate() + ")");
    }
}