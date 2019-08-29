package ZertifizierungsProgramm.TestPackage1;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class ClassB extends ClassA {
    ClassB() {}
    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        new ClassB();
    }
}
