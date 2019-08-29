package TestPackage.SampleQuestions;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class Programmer extends Writer {
    public static void write() {
        System.out.println("Writing code");
    }

    public static void main(String[] args) {
        Writer w = new Author();
        w.write();
    }
}
