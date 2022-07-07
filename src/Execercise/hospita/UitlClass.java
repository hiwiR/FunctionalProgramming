package Execercise.hospita;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class UitlClass {

    static BiFunction<Hospital , LocalDate, Optional<String>> getTopMedication = (hospital,date) ->
            Stream.of(hospital)
                    .flatMap(hospital1 -> hospital1.getDepartmentList().stream())
                    .flatMap(department -> department.getPersonList().stream())
                    .flatMap(person -> person.getRoleList().stream())
                    .filter(role ->role instanceof Patient)
                    .map(role -> (Patient) role)
                    .flatMap(patient -> patient.getVisitList().stream())
                    .filter(visit -> date.getYear()==(visit.getDate().getYear()))
                    .flatMap(visit-> visit.getMedicationList().stream())
                    .collect(Collectors.groupingBy(medica ->medica ))
                    .entrySet()
                    .stream()
                    .sorted((med1,med2) -> med2.getValue().size()-med1.getValue().size())
                    .findFirst()
                    .map(medicationListEntry -> medicationListEntry.getKey())
                    .map(medcationFinal ->medcationFinal.getName());

}
