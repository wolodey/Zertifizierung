package ZertifizierungsProgramm.Test_Level_6.v8_2_1280.v8_2_839;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class TestClass {
    public static void main(String[] args) throws IOException{
        Great g = new Amazing();
        g.doStuff();
        System.out.println(LocalDate.of(2015, Month.JANUARY, 01).format(DateTimeFormatter.ISO_DATE));

        byte b = (byte)320;
        System.out.println(b);
    }

}
