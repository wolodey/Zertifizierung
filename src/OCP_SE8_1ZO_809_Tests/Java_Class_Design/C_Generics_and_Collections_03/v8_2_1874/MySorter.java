package OCP_SE8_1ZO_809_Tests.Java_Class_Design.C_Generics_and_Collections_03.v8_2_1874;

/**
 * Created by WSteinle on 15.03.2017.
 */
public class MySorter {
    public int compare(Person person1, Person person2) {
        return person1.dob.compareTo(person2.dob);
    }
}
