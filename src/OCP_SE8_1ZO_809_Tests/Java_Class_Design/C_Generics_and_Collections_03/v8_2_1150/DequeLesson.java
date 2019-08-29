package OCP_SE8_1ZO_809_Tests.Java_Class_Design.C_Generics_and_Collections_03.v8_2_1150;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by WSteinle on 15.03.2017.
 */
public class DequeLesson {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.addFirst(2);
        d.pop();
        d.offerFirst(3);
        System.out.println(d);
    }
}
