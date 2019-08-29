package OCP_SE8_1ZO_809_Book.Chapter4_Functional_Programming.SteamLesson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by WSteinle on 14.03.2017.
 */
public class People {
    private String name;
    private int age;
    private Sex sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {
        List<People> peopleList = Arrays.asList(new People("Wasja", 16, Sex.MAN), new People("Petja", 23, Sex.MAN), new People("Elena", 30, Sex.WOMEN),
                new People("Ivan Ivanowitch", 69, Sex.MAN));

        //Выбрать мужчин-военнообязанных (от 18 до 27 лет)
        List<People> resultPeopleList = peopleList.stream().filter((p) -> p.getAge() >= 18 && p.getAge() < 27 && p.getSex() == Sex.MAN).collect(Collectors.toList());

        System.out.println(resultPeopleList.get(0).getName());

        //Найти средний возраст среди мужчин
        double result = peopleList.stream().filter((p) -> p.getSex() == Sex.MAN).mapToInt(People::getAge).average().getAsDouble();
        System.out.println(result);

        //Найти количество потенциальных работоспособных людей в выборке
        long resultLong = peopleList.stream().filter((p) -> p.getAge() >= 18).filter((p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55)
                || (p.getSex() == Sex.MAN && p.getAge() < 60)).count();
        System.out.println(resultLong);
    }

}
