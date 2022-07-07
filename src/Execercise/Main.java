package Execercise;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Main {
    static Function<University,List<Student>> getStudents = (university) ->
            Stream.of(university)
                    .flatMap(uni -> uni.getDepartments().stream())
                    .flatMap(department ->department.getPersonList().stream())
                    .flatMap(person -> person.getRoleList().stream())
                    .filter(role -> role instanceof Student)
                    .map(role ->(Student) role)
                    .collect(Collectors.toList());
    static Function<Student,Long> gradeSum =(student)->
            Stream.of(student)
                    .flatMap(student1 -> student1.getGrades().stream())
                    .filter(grade -> grade.getLetter() ==Letter.A ||grade .getLetter() == Letter.B )
                    .mapToLong((grade1) ->grade1.getCourse().getCredit()).sum();

   public static BiFunction<University,Integer,List<Student>> getPassesStudent = (university,k)->
           getStudents.apply(university).stream()
                    .filter(student -> gradeSum.apply(student) >k )
                    .collect(Collectors.toList());



}
