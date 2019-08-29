package OCP_SE8_1ZO_809_Book.Chapter5_Date_Strings_Localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by WSteinle on 22.03.2017.
 */
public class FormatNumbers {
    public static void main(String[] args) {
        int attendessPerYear = 3_200_000;
        int attendessPerMonth = attendessPerYear / 12;

        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(attendessPerMonth);
        System.out.println(us.format(attendessPerMonth));

        NumberFormat ger = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(ger.format(attendessPerMonth));
       // System.out.println(ger.format(attendessPerYear));

        NumberFormat canFrench = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(canFrench.format(attendessPerMonth));

        //Formatting currency
        double price = 48;
        NumberFormat de = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat it = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(de.format(price));
        System.out.println(it.format(price));

        System.out.println();
        System.out.println("New example");

        String s = "40.45";
        NumberFormat en = NumberFormat.getInstance(Locale.US);
        NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
        try {
            System.out.println(en.parse(s));
            System.out.println(fr.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();
        }


        System.out.println();
        System.out.println("New example --- parsing currency");

        String amt = "$92,807.99";
        NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
        try {
            double value = (Double) cf.parse(amt);
            System.out.println(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
