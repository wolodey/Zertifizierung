package OCP_SE8_1ZO_809_Tests.Java_Class_Design.B_AdvancedClassDesign_02.v8_2_1837;

/**
 * Created by WSteinle on 15.03.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        Office off = new HomeOffice();
        System.out.println(Office.getAdress());
        //System.out.println(off.getAdress()); //не работает т.к getAdress() -- static.
        // не нужна инстанция для статик метода. доступ через имя интерфейса
    }
}
