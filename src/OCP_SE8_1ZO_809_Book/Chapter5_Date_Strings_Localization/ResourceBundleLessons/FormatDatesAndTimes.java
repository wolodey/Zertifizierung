package OCP_SE8_1ZO_809_Book.Chapter5_Date_Strings_Localization.ResourceBundleLessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by WSteinle on 22.03.2017.
 */
public class FormatDatesAndTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 21);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        System.out.println();
        System.out.println("Short output --- more useful");

        DateTimeFormatter shortDateTimeShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter shortDateTimeFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter shortDateTimeMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(shortDateTimeShort.format(dateTime));
        System.out.println(shortDateTimeFull.format(date));
        System.out.println(shortDateTimeMedium.format(date));

        System.out.println();
        System.out.println("output with time");
        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        System.out.println(shortF.format(dateTime));
        System.out.println(mediumF.format(dateTime));


        System.out.println();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dateTime.format(f));
        System.out.println(f.format(dateTime));

    }
}
