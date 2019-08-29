package OCP_SE8_1ZO_809_Book.Chapter5_Date_Strings_Localization;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by WSteinle on 13.03.2017.
 */

//Buch Seite 247 (300)  Duration --- для Времени, Period --- для Дат.
public class WorkingWithDurations {
    public static void main(String[] args) {
        Duration daily = Duration.ofDays(1);
        System.out.println(daily);

        Duration everyMilli = Duration.ofMillis(1);
        System.out.println(everyMilli);

        Duration everyNano = Duration.ofNanos(1);
        System.out.println(everyNano);

        Duration hourInSeconds = Duration.ofSeconds(3600);
        System.out.println(hourInSeconds); //PT1H

        //With TemporalUnit interface -used for Differences ------------------

        Duration dailyChrono = Duration.of(1, ChronoUnit.DAYS);
        System.out.println("Chrono Daily " + dailyChrono);

        Duration everyMilliChrono = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println("Chrono every Milli " + everyMilliChrono);

        //ChronoUnit is a great way to determine how far apart two Temporal values are
        // ТОЛЬКО ДЛЯ ВРЕМЕНИ!!! между датами не работает.
        //Temporal includes LocalDate, LocalTime and so on

        LocalTime one = LocalTime.of(5, 15);
        LocalTime two = LocalTime.of(6, 20);
        LocalDate date = LocalDate.of(2017, 1, 20);

        System.out.println(ChronoUnit.HOURS.between(one, two));
        System.out.println(ChronoUnit.MINUTES.between(one, two));
    }
}
