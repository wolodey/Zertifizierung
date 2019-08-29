package ZertifizierungsProgramm.Test_Level3.v8_2_984.v8_2_1453;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by WSteinle on 01.02.2017.
 */
public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.of(2015, 2, 5);
        LocalDate d3 = LocalDate.now();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
