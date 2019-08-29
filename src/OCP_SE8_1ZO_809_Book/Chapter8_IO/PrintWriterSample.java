package OCP_SE8_1ZO_809_Book.Chapter8_IO;

import java.io.*;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class PrintWriterSample {
    public static void main(String[] args) throws IOException {
        File sourse = new File("C:\\Users\\WSteinle\\Desktop\\Zertifizierung_Oracle\\ztest.txt");
        try (PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(sourse))
        )) {
            out.print("Todays weather is: ");
            out.println("Sunny");
            out.print("Todays temperature is: ");
            out.print(1 / 3.0);
            out.println('C');
            out.format("It has rained 10.12 inches this year");
            out.println();
            out.printf("It may rain 21.2 more inches this year");
        }
    }
}
