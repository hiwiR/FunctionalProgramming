package Execercise;

import java.util.List;

public class Professor implements Role {

    List<Grade> grade;

    //Role role;

    public List<Grade> getGrade() {
        return grade;
    }

    public void setGrade(List<Grade> grade) {
        this.grade = grade;
    }

}
