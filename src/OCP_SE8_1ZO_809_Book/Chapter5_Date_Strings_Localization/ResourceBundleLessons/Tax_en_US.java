package OCP_SE8_1ZO_809_Book.Chapter5_Date_Strings_Localization.ResourceBundleLessons;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by WSteinle on 22.03.2017.
 */
//Buch Seite 263 (315)
public class Tax_en_US extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"tax", "new UsTaxCode()"}
        };
    }

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle(
                "resourcebundles.Tax", Locale.US);
        System.out.println(rb.getObject("tax"));
    }
}
