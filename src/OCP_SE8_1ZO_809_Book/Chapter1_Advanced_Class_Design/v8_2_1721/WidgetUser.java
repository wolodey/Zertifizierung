package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design.v8_2_1721;

/**
 * Created by WSteinle on 17.08.2018.
 */
public class WidgetUser {
    public static void main(String[] args) {
        Widget w = new GoodWidget();
        ((Widget)w).doWidgetStuff();
        System.out.println(w.data);
    }
}
