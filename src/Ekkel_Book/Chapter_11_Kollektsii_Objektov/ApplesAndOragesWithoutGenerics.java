package Ekkel_Book.Chapter_11_Kollektsii_Objektov;

import java.util.ArrayList;

/**
 * Created by WSteinle on 31.03.2017.
 */
class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {
        return id;
    }
}

class Orange {}



public class ApplesAndOragesWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i = 0; i<3; i++) {
            apples.add(new Apple());

        }
    //    apples.add(new Orange());


        for(int i = 0; i<apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }

        for (Apple c : apples) {
            System.out.println(c.id());
        }
            

            

    }
}
