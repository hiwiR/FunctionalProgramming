package Execercise;
/*
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    static Function<Student,Long> score=(student)->
            Stream.of(student).flatMap(s->s.getGrades().stream())
                    .filter(g->g.getLetter()== Letter.A|| g.getLetter()==Letter.B)
                    .mapToLong(g->g.getCourse().getCredit()).sum();

    static Function<University, List<Student>> getStudents=(univ)->
            Stream.of(univ)
                    .flatMap(u->u.getDepartments().stream())
                    .flatMap(d->d.getPersons().stream())
                    .flatMap(p->p.getRoles().stream())
                    .filter(r->r instanceof Student)
                    .map(r->(Student)r)

                    .collect(Collectors.toList());

    static Function<University,List<Course>> getCourses=(univ)->
            getStudents.apply(univ)
                    .stream().flatMap((s->s.getGrades().stream()))
                    .map(g->g.getCourse()).distinct().collect(Collectors.toList());
    static Function<Course, Optional<Double>> getFailureRatio=(course)-> course.getGrades().isEmpty()?Optional.empty():
            Optional.of(Stream.of(course).flatMap(c->c.getGrades().stream())
                    .filter(g->!(g.getLetter()==Letter.A||g.getLetter()==Letter.B)).count()*1.0/course.getGrades().stream().count());

    static BiFunction<Univesity,Long,List<Course>> worstKcourses=(univ,k)->
            getCourses.apply(univ).stream()
                    .sorted((c1,c2)->(int)(getFailureRatio.apply(c2).orElse(0.0)-getFailureRatio.apply(c1).orElse(0.0)))
                    .limit(k)
                    .collect(Collectors.toList());

    static BiFunction<Univesity,Long,List<Student>> getGraduates=(univ,k)->
            getStudents.apply(univ).stream()
                    .filter(s->score.apply((s))>=k)
                    .sorted((s1,s2)->(int)(score.apply(s2)-score.apply(s1)))
                    .collect(Collectors.toList());



    static TriFunction<List<String>,Long,List<String>, List<String>> topWords=  (lines, k, stopWords)->
            lines.stream()
                    .flatMap(l -> Arrays.asList(l.split(" ")).stream())
                    .filter(w->!stopWords.contains(w))
                    .collect(Collectors.groupingBy(w -> w))
                    .entrySet()
                    .stream().sorted((e1, e2) -> (int) (e2.getValue().stream().count() - e1.getValue().stream().count()))
                    .limit(k)
                    .map(e -> e.getKey())
                    .collect(Collectors.toList());
}
*/