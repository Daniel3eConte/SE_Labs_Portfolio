package org.example;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String name;
    private String email;
    private String password; // adding a password field
    private int credits;
    private List<Activity> activities;

    public Student(String studentID, String name, String email, String password, int credits) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.credits = credits;
        this.activities = new ArrayList<>();
    }
    public boolean checkPassword(String pwd) {
        return this.password.equals(pwd);
    }


    public Activity createActivity(String activityName, int price, String description, Category category) {
        Activity activity = new Activity(activityName, price, description, category);
        activities.add(activity);
        category.addActivity(activity);
        return activity;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}