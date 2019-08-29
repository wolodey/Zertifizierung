package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_1433;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by WSteinle on 10.02.2017.
 */
public class DateTest {
    public static void main(String[] args) {
        LocalDateTime greatDay = LocalDateTime.parse("2015-01-01");
        String greatDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(greatDayStr);
    }
}
