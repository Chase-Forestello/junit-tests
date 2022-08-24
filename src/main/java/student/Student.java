// Complete - Java II - JUnit Exercise
package student;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>(0);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name) && grades.equals(student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grades);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrades(int... grade) {
        for (int i : grade) {
            grades.add(i);

        }
    }

    public double getGradeAverage() {
        double avg = 0;
        for (Integer grade : grades) {
            avg += grade;
        }
        return avg / grades.size();
    }
}
