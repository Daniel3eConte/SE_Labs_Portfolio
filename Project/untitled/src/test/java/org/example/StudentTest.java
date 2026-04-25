package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentTest {

    @Test
    void studentCanCreateActivityWithCategory() {
        Student student = new Student("S001", "Anna", "anna@edu.p.lodz.pl", 10);
        Category category = new Category("Tutoring");

        Activity activity = student.createActivity(
                "Java tutoring",
                5,
                "I can help with Java basics",
                category
        );

        assertEquals("Java tutoring", activity.getActivityName());
        assertEquals(5, activity.getPrice());
        assertEquals("I can help with Java basics", activity.getDescription());
        assertEquals(category, activity.getCategory());
    }

    @Test
    void createdActivityIsSavedInsideStudentActivities() {
        Student student = new Student("S001", "Anna", "anna@edu.p.lodz.pl", 10);
        Category category = new Category("Tutoring");

        Activity activity = student.createActivity(
                "Java tutoring",
                5,
                "I can help with Java basics",
                category
        );

        assertEquals(1, student.getActivities().size());
        assertTrue(student.getActivities().contains(activity));
    }
    @Test
    void createdActivityIsAddedToCategory() {
        Student student = new Student("S001", "Anna", "anna@edu.p.lodz.pl", 10);
        Category category = new Category("Tutoring");

        Activity activity = student.createActivity(
                "Java tutoring",
                5,
                "I can help with Java basics",
                category
        );

        assertEquals(1, category.getActivities().size());
        assertTrue(category.getActivities().contains(activity));
    }
}