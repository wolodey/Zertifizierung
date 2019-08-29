package OCP_SE8_1ZO_809_Book.ExamEssentials.Kap3;

/**
 * Created by WSteinle on 15.12.2017.
 */

//Aufgabe 6, Kap 3
public class Hello6<T> {
    T t;
    public Hello6(T t) {
        this.t = t;
    }
    public String toString() {
        return t.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Hello6<String>("Hi"));
        System.out.println(new Hello6("There"));
    }
}
