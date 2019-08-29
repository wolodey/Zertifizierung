package OCP_SE8_1ZO_809_Book.Chapter5_Date_Strings_Localization;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Created by WSteinle on 13.03.2017.
 */

//Im Buch Seiter 244 (296)  Duration --- для Времени, Period --- для Дат
public class WorkingWithPeriods {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.MARCH, 30);
        Period period = Period.ofMonths(1);
        performAnimalEnrichment(start, end, period);

        System.out.println(Period.of(1,2,3));


        System.out.println(Period.ofWeeks(3));
    }

    private static void performAnimalEnrichmentMitInt(LocalDate start, LocalDate end, int period) {
        LocalDate upTo = start;
        while(upTo.isBefore(end)) {
            System.out.println("give me new toy: " + upTo);
            upTo = upTo.plusMonths(period);
        }
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while(upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
