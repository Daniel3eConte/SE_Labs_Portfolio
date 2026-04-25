package org.example;

public class Student {
    private String studentID;
    private String name;
    private String email;
    private int credits;

    public Student(String studentID, String name, String email, int credits) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.credits = credits;
    }

    public void createActivity(String activityName, int price, String description) {
        System.out.println("Activity Created: " + activityName);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
    }

}
