package com.example.lab3;

public class StudentUser extends User {
    private String studentFaculty;

    public StudentUser(String userID, String userName, String email, String password, String studentFaculty) {
        super(userID, userName, email, password);
        this.studentFaculty = studentFaculty;
    }

    public String getStudentFaculty() {
        return studentFaculty;
    }

    public void setStudentFaculty(String studentFaculty) {
        this.studentFaculty = studentFaculty;
    }

    @Override
    public void showUser() {
        System.out.println("Student ID: " + getUserID());
        System.out.println("Name: " + getUserName());
        System.out.println("Email: " + getEmail());
        System.out.println("Faculty: " + studentFaculty);
    }
}