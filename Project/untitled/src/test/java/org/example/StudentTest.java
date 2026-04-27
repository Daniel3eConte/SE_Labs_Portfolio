package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class StudentTest {

    @Test
    void studentCanCreateActivityWithCategory() {
        Student student = new Student("S001", "Anna", "anna@edu.p.lodz.pl", "mago", 10);
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
        Student student = new Student("S001", "Anna", "anna@edu.p.lodz.pl", "mago", 10);
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
        Student student = new Student("S001", "Anna", "anna@edu.p.lodz.pl", "mago", 10);
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

    @Test
    public void testCheckPasswordCorrect() {
        Student student = new Student("12345678", "Mario Rossi", "mario@univ.it", "secret123", 180);
        assertTrue(student.checkPassword("secret123"));
    }

    @Test
    public void testCheckPasswordWrong() {
        Student student = new Student("12345678", "Mario Rossi", "mario@univ.it", "secret123", 180);
        assertFalse(student.checkPassword("parola_sbagliata"));
    }

    @Test
    public void testCheckPasswordEmpty() {
        Student student = new Student("12345678", "Mario Rossi", "mario@univ.it", "secret123", 180);
        assertFalse(student.checkPassword(""));
    }

    @Test
    public void testCheckPasswordCaseSensitive() {
        Student student = new Student("12345678", "Mario Rossi", "mario@univ.it", "Secret123", 180);
        assertFalse(student.checkPassword("secret123"));
    }
}