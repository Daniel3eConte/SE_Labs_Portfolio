package org.example;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String name;
    private String email;
    private int credits;
    private List<Activity> activities;
    public Student(String studentID, String name, String email, int credits) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.credits = credits;
    }

    public Activity createActivity(String activityName, int price, String description) {
        Activity activity = new Activity(activityName, price, description);
        activities.add(activity);
        return activity;    }
    public List<Activity> getActivities() {
        return activities;
    }

}
