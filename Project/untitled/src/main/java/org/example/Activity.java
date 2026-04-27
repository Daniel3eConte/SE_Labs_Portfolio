package org.example;

public class  Activity {//made activity class to pass the first test
    private String activityName;
    private int price;
    private String description;
    private Category category;

    public Activity(String activityName, int price, String description, Category category) {
        this.activityName = activityName;
        this.price = price;
        this.description = description;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return activityName + " (" + price + ")";
    }
}