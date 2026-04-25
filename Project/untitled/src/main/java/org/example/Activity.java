package org.example;

public class  Activity {//made activity class to pass the first test
    private String activityName;
    private int price;
    private String description;

    public Activity(String activityName, int price, String description) {
        this.activityName = activityName;
        this.price = price;
        this.description = description;
    }

    public String getActivityName() {
        return activityName;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}