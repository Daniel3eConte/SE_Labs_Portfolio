package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void studentCanCreateActivity() {
        Student student = new Student("S001", "Anna", "anna@edu.p.lodz.pl", 10);

        Activity activity = student.createActivity(
                "Java tutoring",
                5,
                "I can help with Java basics"
        );

        assertEquals("Java tutoring", activity.getActivityName());
        assertEquals(5, activity.getPrice());
        assertEquals("I can help with Java basics", activity.getDescription());
    }
}