package Execercise.hospita;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Visit {

    private LocalDate date;
    private int rating;
    private List<Medication> medicationList;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Medication> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(List<Medication> medicationList) {
        this.medicationList = medicationList;
    }
}
