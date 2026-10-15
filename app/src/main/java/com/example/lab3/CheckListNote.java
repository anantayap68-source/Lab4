package com.example.lab3;

import java.util.List;

public class CheckListNote extends Note {
    private List<String> items;

    public CheckListNote(String title, List<String> items, String createdDate) {
        super(title, createdDate);
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public void getSummary() {
        System.out.println("Checklist - " + getTitle() + " (" + getCreatedDate() + "): " + items.toString());
    }
}
