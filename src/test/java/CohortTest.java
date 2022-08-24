// Complete - Java II - JUnit Exercise
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort cohort;
    private Student chase;
    private Student chaseO;

    @Before
    public void setUp(){
        cohort = new Cohort();
        chase = new Student(1,"Chase");
        chase.addGrades(98,89,79,99);
        cohort.addStudent(chase);
        chase = new Student(2, "Sam");
        chase.addGrades(89,99,82);
        cohort.addStudent(chase);
        chase = new Student(3, "Chris");
        chase.addGrades(77, 87, 98, 92);
        cohort.addStudent(chase);
        chaseO = cohort.getStudents().get(0);
//        91,25;
//        90;
//        88.5;
//        89.91;
    }

    @Test
    public void addStudentTest(){
        assertEquals(3, cohort.getStudents().size());
    }

    @Test
    public void getStudentsTest(){
        assertSame(chase, chaseO);
    }

    @Test
    public void getCohortAverageTest(){
        System.out.println(cohort.getCohortAverage());
        assertEquals(89.91, cohort.getCohortAverage(), .1);
    }
}
//A Cohort instance can add a Student to the List of students.
//A Cohort instance can get the current List of students.
//A Cohort instance can get the average, and it's being calculated correctly.