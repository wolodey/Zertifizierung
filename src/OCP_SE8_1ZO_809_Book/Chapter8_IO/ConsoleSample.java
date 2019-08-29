package OCP_SE8_1ZO_809_Book.Chapter8_IO;

import java.io.Console;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class ConsoleSample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            System.out.println("Available");
            String userInput = console.readLine();
            console.writer().println("your input = " + userInput);
        }

    }
}
