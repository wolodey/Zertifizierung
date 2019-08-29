package OCP_SE8_1ZO_809_Book.Chapter5_Date_Strings_Localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by WSteinle on 14.03.2017.
 */
public class ZooOpen {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale german = new Locale("de", "DE");

        printProperties(us);
        System.out.println();
        printProperties(german);
    }
    public static void printProperties(Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("open"));
    }
}
