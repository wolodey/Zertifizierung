package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1834;

import java.util.*;

/**
 * Created by WSteinle on 27.03.2017.
 */
public class IfAbsentTest {

    static Map<String, List<Double>> groupedValues = new HashMap<>();

    public static void process (String name, Double value){
        List<Double> values = groupedValues.get(name);
        if(values == null) {
            values = new ArrayList<Double>();
            groupedValues.put(name, values);
        }
        values.add(value);
        System.out.println(values.get(0));
    }

    public void process2(String name, Double value) {
        groupedValues.computeIfAbsent(name, (a) -> new ArrayList<Double>()).add(value);
    }

    public static void main(String[] args) {
     //  double [] doubleList = {1.0, 3.8, 5.7, 6.0};
        process("al", 10.0);

        System.out.println(groupedValues.isEmpty());



    }
}
