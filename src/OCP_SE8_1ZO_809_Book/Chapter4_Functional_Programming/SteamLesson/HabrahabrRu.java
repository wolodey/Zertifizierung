package OCP_SE8_1ZO_809_Book.Chapter4_Functional_Programming.SteamLesson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by WSteinle on 14.03.2017.
 */
public class HabrahabrRu {

    public static void main(String[] args) {
        List <String> list = Arrays.asList("a1", "a2", "a3", "a1", "a1", "a7");

        long anzahl = list.stream().filter("a1":: equals).count();
        System.out.println("Количество элементов равных а1 = " + anzahl);

        System.out.println("Вернуть первый элемент" +
                " коллекции или 0 если коллекция пуста = " + list.stream().findFirst().orElse("0"));

        System.out.println(list.stream().skip(list.size()-1).findAny().orElse("leer"));
       // list.stream().skip(list.size()-1).findAny().orElse("leer");

        System.out.println(list.stream().filter("a3"::equals).findFirst().get());

        System.out.println(list.stream().skip(2).findFirst().get());

        System.out.println("Вернуть 2 элемента начиная со второго = " + list.stream().skip(1).limit(2).toArray());

        list.stream().filter((s) -> s.contains("1")).collect(Collectors.toList()).forEach(System.out::print);
    }
}
