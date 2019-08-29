package OCP_SE8_1ZO_809_Book.Chapter8_IO;

import java.io.File;

/**
 * Created by WSteinle on 30.03.2017.
 */
public class ReadFileInformation {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\WSteinle\\Desktop\\Zertifizierung_Oracle\\ztest.txt");
        System.out.println("File Exists: " + file.exists());

        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());

            if (file.isFile()) {
                System.out.println("File size: " + file.length());
                System.out.println("File LastModified: " + file.lastModified());
            } else {
                for (File subfile : file.listFiles()) {
                    System.out.println("\t" + subfile.getName());
                }
            }
        }

        File directory = new File("C:\\Users\\WSteinle\\Desktop\\Zertifizierung_Oracle");
        for (File subdir : directory.listFiles()) {
            System.out.println("\t"+ subdir.getName());
        }

    }
}
