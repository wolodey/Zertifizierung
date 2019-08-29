package ZertifizierungsProgramm.Test_Level1.v8_2_974;

import java.util.Stack;

/**
 * Created by WSteinle on 09.02.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        processStacks(s1, s2);
        System.out.println(s1 + " " + s2);


        Integer wrapperInt = new Integer(20);
        int intValue = 20;
        int intValue2 = 20;

        Short wrapperShort = new Short((short)20);
        short shortValue = 20;

        Long wrapperLong = new Long(20);
        long longValue = 20;

        Float wrapperFloat = new Float(20);
        float floatValue = 20.5f;

        Double wrapperDouble = new Double(20);
        double doubleValue = 20;

        System.out.println(floatValue == doubleValue);


        System.out.println(wrapperFloat.equals(doubleValue));
        System.out.println(wrapperShort == doubleValue);
        System.out.println(wrapperFloat == intValue);
        System.out.println(wrapperDouble == intValue);
        System.out.println(wrapperShort  + " " + wrapperInt);

        float floatValue2 = intValue;
    }

    public static void processStacks(Stack x1, Stack x2) {
        x1.push(new Integer("100"));
        x2 = x1;

    }
}
