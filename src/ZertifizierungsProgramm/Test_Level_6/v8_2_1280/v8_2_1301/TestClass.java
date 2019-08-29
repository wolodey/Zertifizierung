package ZertifizierungsProgramm.Test_Level_6.v8_2_1280.v8_2_1301;

/**
 * Created by WSteinle on 08.02.2017.
 */

class SomeThrowable extends Throwable {}
class MyThrowable extends SomeThrowable {}

public class TestClass {
    public static void main(String[] args) throws SomeThrowable {
        try{
            m1();
        }catch (SomeThrowable e) {
            throw e;
        } finally{
            System.out.println("done");
        }
    }
    public static void m1() throws MyThrowable {
        throw new MyThrowable();
    }
}
