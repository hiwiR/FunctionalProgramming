package Execercise.hospita;

import java.util.List;

public class Patient extends Role{

    List<Visit> visitList;

    public List<Visit> getVisitList() {
        return visitList;
    }

    public void setVisitList(List<Visit> visitList) {
        this.visitList = visitList;
    }
}
