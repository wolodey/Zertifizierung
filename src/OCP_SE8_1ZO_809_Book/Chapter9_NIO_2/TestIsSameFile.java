package OCP_SE8_1ZO_809_Book.Chapter9_NIO_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by WSteinle on 03.04.2017.
 */
public class TestIsSameFile {
    public static void main(String[] args) {
        try {
            System.out.println(Files.isSameFile(Paths.get("/user/home/cobra"), Paths.get("/user/home/snake")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
