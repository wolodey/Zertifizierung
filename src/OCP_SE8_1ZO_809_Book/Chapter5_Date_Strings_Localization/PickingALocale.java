package OCP_SE8_1ZO_809_Book.Chapter5_Date_Strings_Localization;

import java.util.Locale;

/**
 * Created by WSteinle on 13.03.2017.
 */
//Buch Seite 256 (308)
public class PickingALocale {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);

        System.out.println(new Locale("fr"));
        System.out.println(new Locale("hi", "IN"));
    }
}
