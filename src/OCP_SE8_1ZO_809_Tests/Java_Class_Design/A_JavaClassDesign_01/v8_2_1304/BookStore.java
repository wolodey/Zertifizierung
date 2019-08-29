package OCP_SE8_1ZO_809_Tests.Java_Class_Design.A_JavaClassDesign_01.v8_2_1304;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class BookStore {
    Map<Book, Integer> map = new HashMap<Book, Integer>();

    public BookStore() {
        Book b = new Book("A111");
        System.out.println("hashCode from BookStore b - A111 = " + b.hashCode());
        map.put(b, 10);

        b = new Book("B222");
        System.out.println("hashCode from BookStore b - B222 = " + b.hashCode());
        map.put(b, 5);

        b = new Book("A111");
        map.put(b, 15);
        map.put(b, 23);
        map.put(b, 222);
        System.out.println("hashCode from BookStore b - A111 = " + b.hashCode());
    }

    Integer getNumberOfCopies(Book book) {
        return map.get(book);
    }

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Book book1 = new Book("A111");
        Book book2 = new Book("A111");

       /* System.out.println(bookStore.getNumberOfCopies(book1));
        System.out.println(bookStore.getNumberOfCopies(book2));
        System.out.println("Map size = " + bookStore.map.size());

        Map<Integer, String> probeMap = new HashMap<>();
        probeMap.put(1, "a");
        probeMap.put(1, "b");
        probeMap.put(1, "aaaaaaaaaa");
        System.out.println("Map size2 = " + probeMap.size());
        System.out.println(probeMap.get(1));

        System.out.println("hashCode Ausgabe: ");

        System.out.println("Book1 hashCode = " + book1.hashCode());
        System.out.println("Book2 hashCode = " + book2.hashCode());
        */
    }
}
