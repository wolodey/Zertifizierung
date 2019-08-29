package OCP_SE8_1ZO_809_Tests.Java_Class_Design.C_Generics_and_Collections_03.v8_2_1874;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by WSteinle on 15.03.2017.
 */
public class SortTest {
    public static int diff(Person person1, Person person2) {
        return person1.dob.compareTo((person2.dob));
    }

    public static int diff(Date date1, Date date2){
        return date1.compareTo(date2);
    }

    public static void main(String[] args) {
        ArrayList<Person> a1 = new ArrayList<>();
        a1.add(new Person("Paul", "01012000"));
        a1.add(new Person("Peter", "01011990"));
        a1.add(new Person("Patrick", "01012002"));
    }
}
