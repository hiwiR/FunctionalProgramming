import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class MyRandomGen  {
    public static  void main(String[] args) {
        MyRandomGen mg = new MyRandomGen();
        Integer upperBound = 25;
        Supplier arg = () -> new Random().nextInt(25);
        Integer random = (Integer) arg.get();

        BiFunction<Integer,Integer,Double> power = Math :: pow;
                //(x,y) ->Math.pow(x,y);
        out.println(power.apply(2,3) );
        List<String> testList = Arrays.asList("mango is my favourite","apple is sweet");
        String[] str = {"ball","apple"};
        out.println(mg.findStartsWithLetter(testList,"man"));
        Consumer<List<String>> print = System.out::println;
        Consumer<String[]> arraySort = Arrays::sort;
        arraySort.accept(str);
       // Function<List<String>, Integer> func =
        System.out.println(mg.countOfWord(testList));
    }
    public long countOfWord(List<String> listOfWord){
        return listOfWord.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .skip(2)
                .distinct()
                .count();
    }
    public List<String> findStartsWithLetter(List<String> list,String c){
        return list.stream()
                .filter(name ->name.startsWith(c))
                .map(name ->name.toUpperCase())
                .collect(Collectors.toList());
    }
}
