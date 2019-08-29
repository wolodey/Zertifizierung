package OCP_SE8_1ZO_809_Book.Chapter9_NIO_2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by WSteinle on 03.04.2017.
 */
public class TestNormalizeMethod {
    public static void main(String[] args) {
        Path path3 = Paths.get("C:\\data");
        Path path4 = Paths.get("C:\\user\\home");

        Path relativePath = path3.relativize(path4);
        System.out.println(relativePath);

        System.out.println(path3.resolve(relativePath));

        System.out.println(path3.resolve(relativePath).normalize());

        try {
            System.out.println(Paths.get(".").toRealPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
