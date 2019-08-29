package TestPackage;

import java.time.LocalDate;

/**
 * Created by WSteinle on 20.12.2016.
 */
public class Msg_Pm_Formulas {

    public static double nrOfInterestMonths(LocalDate dStart, LocalDate dEnd) {

        double days = dEnd.getDayOfMonth() - dStart.getDayOfMonth();
        double month = dEnd.getMonthValue() - dStart.getMonthValue();
        System.out.println("Days = " + days);
        double result = month + (days/30);

        return result;
    }

    public static void main(String[] args) {
        LocalDate dateS = LocalDate.of(2013, 01, 31);
        LocalDate dateE = LocalDate.of(2013, 02, 28);

        // надо подсчитать разницу между месяцами


        double result = nrOfInterestMonths(dateS, dateE);
        System.out.println(result);



    }

}
