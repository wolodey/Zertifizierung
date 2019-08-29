package OCP_SE8_1ZO_809_Book.Chapter9_NIO_2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by WSteinle on 03.04.2017.
 */
public class Test {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\WSteinle\\Desktop\\Zertifizierung_Oracle\\ztest.txt");
        System.out.println("The Path Name is: " + path);

        for (int i= 0; i<path.getNameCount(); i++) {
            System.out.println(" Element "+ i + " is: " + path.getName(i));
        }
        System.out.println();

        System.out.println("File name is: " + path.getFileName());
        System.out.println("Filesystem is: " + path.getFileSystem());
        System.out.println("Root is: " + path.getRoot());
        System.out.println("CurrentParent is: " + path.getParent());

        //testing isAblolute() and toAbsolutePath() methods

        System.out.println();
        System.out.println("Path is absolute? - " + path.isAbsolute());
        System.out.println("Ablolute Path: " + path.toAbsolutePath());


        System.out.println();
        System.out.println(Paths.get("c:/goats/food.java").isAbsolute());

        //testing subpath(int, int) method

        System.out.println();
        System.out.println("Subpath for 0 - 3 is " + path.subpath(0, 3));
        System.out.println("Subpath for 1 - 3 is " + path.subpath(1, 3));
        System.out.println("Subpath for 1 - 5 is " + path.subpath(1, 5));
    }
}
