package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1323;

/**
 * Created by WSteinle on 27.01.2017.
 */
public class ExceptionTest {
    void myMethod() throws MyException {
        throw new MyException3();
    }

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.myMethod();
        } catch (MyException me) {
            System.out.println("MyException thrown");
        }
      //  } catch (MyException3 me3) {
        //    System.out.println("MyException3 thrown");
       // }
    }
}
