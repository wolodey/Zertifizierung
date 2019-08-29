package OCP_SE8_1ZO_809_Tests.Java_Class_Design.B_AdvancedClassDesign_02.v8_2_1388;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WSteinle on 15.03.2017.
 */
public class EnumAusgabe {
    public static void main(String[] args) {
        for(Card card : Card.values()) {
            System.out.println(card);
        }

        List<String> list = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        List<String> listd = new ArrayList<>(10);
    }
}
