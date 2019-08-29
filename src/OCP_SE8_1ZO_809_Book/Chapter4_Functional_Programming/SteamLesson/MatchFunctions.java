package OCP_SE8_1ZO_809_Book.Chapter4_Functional_Programming.SteamLesson;

import java.util.Arrays;
import java.util.List;

/**
 * Created by WSteinle on 14.03.2017.
 */
//Тестируем anyMatch, allMatch, noneMatch

public class MatchFunctions {
    public static boolean result;

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "a3", "a1");

        //Найти существует ли хоть один "а1" элемент в коллекции
        System.out.println(list.stream().anyMatch("a1"::equals));

        //Найти существуем ли хоть один "а8" элемент в коллекции
        System.out.println(list.stream().anyMatch("a8" :: equals));

        //Найти есть ли символ "1" у всех элементов коллекции
        System.out.println(list.stream().allMatch((s)-> s.contains("1")));

        //Проверить что не существует ни одного "а7" элемента в коллекции
        System.out.println(list.stream().noneMatch("a7" :: equals));


    }
}
