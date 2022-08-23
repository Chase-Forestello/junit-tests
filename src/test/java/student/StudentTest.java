package student;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private Student chase;

    @Before
    public void setUp(){
        chase = new Student(1, "Chase");
        chase.addGrades(98, 97, 87, 54);
    }

    @Test
    public void constructorTest(){
        assertEquals (1, chase.getId());
        assertEquals("Chase", chase.getName());
        assertEquals(4, chase.getGrades().size());
    }

    @Test
    public void getIdTest(){
        assertEquals(1, chase.getId());
    }

    @Test
    public void getNameTest(){
        assertEquals("Chase", chase.getName());
    }

    @Test
    public void addGradeTest(){
        long indexZero = chase.getGrades().get(0);
        assertEquals(98, indexZero);
    }

    @Test
    public void getGradesTest(){
        assertEquals("[98, 97, 87, 54]", chase.getGrades().toString());
    }

    @Test
    public void getGradeAverageTest(){
        assertEquals(84, chase.getGradeAverage(), .1);
    }
}