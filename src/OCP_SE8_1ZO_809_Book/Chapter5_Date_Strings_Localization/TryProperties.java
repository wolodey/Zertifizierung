package OCP_SE8_1ZO_809_Book.Chapter5_Date_Strings_Localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by WSteinle on 14.03.2017.
 */
public class TryProperties {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "CA");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Zoo", locale);
        System.out.print(resourceBundle.getString("hello"));
        System.out.print(". ");
        System.out.print(resourceBundle.getString("name"));
        System.out.print(" ");
        System.out.print(resourceBundle.getString("open"));
        System.out.print(" ");
        System.out.println(resourceBundle.getString("visitor"));
    }
}
