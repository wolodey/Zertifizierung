package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class StringBuilderEqualsTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("leon");
        StringBuilder stringBuilder2 = new StringBuilder("leon");
        System.out.println(stringBuilder1 == stringBuilder2);
        System.out.println(stringBuilder1.equals(stringBuilder2));
    }
}
