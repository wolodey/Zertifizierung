package OCP_SE8_1ZO_809_Tests.Java_Class_Design.A_JavaClassDesign_01.v8_2_1721;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class WidgetUser {
    public static void main(String[] args) {
        Widget w = new GoodWidget();
        ((Widget) w).doWidgetStuff();

     //   System.out.println(w.data);
        //   System.out.println(((GoodWidget)w).data);
    }
}
