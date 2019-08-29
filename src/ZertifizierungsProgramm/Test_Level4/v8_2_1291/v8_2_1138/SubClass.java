package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_1138;

/**
 * Created by WSteinle on 10.02.2017.
 */
public class SubClass extends Super {
    public String toString() {
        int x = super.a;
        System.out.println(x);
        return super.toString() + "3";
    }

    public static void main(String[] args) {
        System.out.println(new SubClass());


        Integer intValue = new Integer("15");
        System.out.println(intValue);
    }
}
