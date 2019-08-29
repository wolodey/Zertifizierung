package OCP_SE8_1ZO_809_Tests.Java_Class_Design.C_Generics_and_Collections_03.v8_2_1445;

import java.util.List;

/**
 * Created by WSteinle on 15.03.2017.
 */
public class GenericFunctionLesson {
    public static <E extends CharSequence> List <? super E> doIT(List<E> nums) {
        return nums;
    }

    public static void main(String[] args) {
     //   List<String> result = doIT(ArrayList<String> in);
    }
}
