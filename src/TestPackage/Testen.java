package TestPackage;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by WSteinle on 07.10.2016.
 */
public class Testen implements Formula {


    public void Testen() {}

    public static int howMany ( boolean b, boolean... b2) {
        return b2.length;
    }

    public static void main(String[] args) throws Exception {

     /*   BigDecimal bd = BigDecimal.valueOf(2);
        BigDecimal bd2 = BigDecimal.valueOf(1.1);
        System.out.println(bd.subtract(bd2));

        BigDecimal bd3 = BigDecimal.valueOf(1.1);
        BigDecimal bd4 = new BigDecimal(1.1);
        System.out.println(bd3 + " " + bd4);

        double d1 = 2;
        double d2 = 1.1;
        System.out.println("Doublewerte " + (d1-d2));

        BigDecimal bd5 = new BigDecimal(1.1);
        bd5.setScale(1, BigDecimal.ROUND_CEILING);
        System.out.println(bd5);
        System.out.println( bd5.setScale(6, BigDecimal.ROUND_CEILING));

        int a = Integer.MIN_VALUE;
        System.out.println(a);
        int b = -a;
        System.out.println(a + " " +b);*/

        List<String> list = new ArrayList<>();
        list.add("Hawk");
        list.add("robin");

        String[] stringArray = list.toArray(new String[1]);
        System.out.println(stringArray.length);

        String[] array = {"hawk", "robin"};
        List<String> listString = Arrays.asList(array);

        System.out.println(listString.size());


        LocalDate date =  LocalDate.of(2018, Month.APRIL, 30);
        System.out.println(date.getYear() + " " + date.getMonthValue());

        System.out.println(howMany(true, new boolean[2]));

        Testen testen = new Testen();
        testen.howMany(true, true, true);


    }

    @Override
    public double calculate(int a) {
        return a++;
    }
}
