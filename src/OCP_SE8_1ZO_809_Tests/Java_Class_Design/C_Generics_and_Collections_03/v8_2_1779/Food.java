package OCP_SE8_1ZO_809_Tests.Java_Class_Design.C_Generics_and_Collections_03.v8_2_1779;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class Food implements Comparable <Food> {
    String name;
    int caloriesPerServing;

    public String getName() {
        return name;
    }

    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }

    public Food(String name, int caloriesPerServing) {
        this.name = name;
        this.caloriesPerServing = caloriesPerServing;
    }

    @Override
    public int compareTo(Food o) {
        return this.name.compareTo(o.name);
    }



    public static void main(String[] args) {

        Comparator<Food> byCalories = new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return o1.getCaloriesPerServing() - o2.getCaloriesPerServing();
            }
        };

        Comparator<Food> byKalorien = (food1, food2) -> food1.caloriesPerServing - food2.caloriesPerServing;
        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("BBB", 20));
        foodList.add(new Food("ZZZZ", 50));
        foodList.add(new Food("EEE", 10));
        foodList.add(new Food("KKK", 90));

        Collections.sort(foodList);
        Collections.sort(foodList, byKalorien);

        for (Food food : foodList) {

            System.out.println(food.getCaloriesPerServing());
        }
    }
}
