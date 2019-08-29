package ZertifizierungsProgramm.Test_Level1.v8_2_900;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by WSteinle on 26.01.2017.
 */
public class Wald {
    public void m1() {


    }



    public static void main(String[] args) {

        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.of(2015, 2, 5);
        LocalDate d3 = LocalDate.now();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);


        StringBuilder sb = new StringBuilder("12345678");
        sb.setLength(10);

        System.out.println(sb.length());

    }
}

