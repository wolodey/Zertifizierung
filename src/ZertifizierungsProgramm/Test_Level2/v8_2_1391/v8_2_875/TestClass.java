package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_875;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        Data d1 = new Data(10);
        System.out.println(d1.intVal);
        d1.strVal = "D1";
        Data d2 = d1;
        d2.intVal = 20;
        System.out.println("d2 val = " + d2.strVal);
        System.out.println(d2.intVal);
    }
}
