package org.example;
import java.util.ArrayList;
import java.util.List;
public class Category {
    private String categoryName;
    private List<Activity> activities;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.activities = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Activity> getActivities() {
        return activities;
    }
    @Override
    public String toString() {
        return categoryName;
    }
}