package Execercise;

import java.util.List;

public class Student implements Role{
    //Role role;
    List<Grade> grades;

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
