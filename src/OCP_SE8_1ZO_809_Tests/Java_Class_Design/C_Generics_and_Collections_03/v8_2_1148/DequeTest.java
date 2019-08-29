package OCP_SE8_1ZO_809_Tests.Java_Class_Design.C_Generics_and_Collections_03.v8_2_1148;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
       // d.offerLast(2);
        d.push(2);
        d.push(3);
        //d.peekFirst();
        //d.removeLast();
        //d.pop();
        System.out.println(d);
        System.out.println(d.pollFirst());
       // d.pollLast();
        System.out.println(d.poll());
        System.out.println(d.pollLast());
    }
}
