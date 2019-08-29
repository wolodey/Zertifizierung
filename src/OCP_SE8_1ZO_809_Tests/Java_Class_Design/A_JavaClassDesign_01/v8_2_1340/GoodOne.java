package OCP_SE8_1ZO_809_Tests.Java_Class_Design.A_JavaClassDesign_01.v8_2_1340;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class GoodOne {
    int theval;

    public int hashCode() {
        return theval%3;
    }

    public boolean equals(Object obj) {
        try {
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
