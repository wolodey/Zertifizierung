package OCP_SE8_1ZO_809_Book.Chapter8_IO;

import java.io.File;

/**
 * Created by WSteinle on 30.03.2017.
 */
public class SeparatorExample {
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.separator"));// separator = "\"
        System.out.println(File.separator); // separator = "\"
    }
}
