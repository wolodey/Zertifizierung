package ZertifizierungsProgramm.Test_Level3.v8_2_984.v8_2_1037;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class Sub extends Base {
    public void methodA() {
        System.out.println("sub - methodA");
    }

    public void methodB() {
        System.out.println("sub - MethodB");
    }

    public static void main(String[] args) {
        Base b = new Sub();
        b.methodA();
       // b.methodB();
    }
}
