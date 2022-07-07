package Execercise;

import java.util.List;

public class Course {

    String courseName;
    List<Grade> gradesList;
    Long credit;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {

        this.courseName = courseName;
    }

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }

}
