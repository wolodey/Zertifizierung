package OCP_SE8_1ZO_809_Tests.Java_Class_Design.A_JavaClassDesign_01.v8_2_1298;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class BookStore {
    Map<Book, Integer> map = new HashMap<Book, Integer>();

    int getNumberOfCopies(Book book) {
        return map.get(book);
    }

    public void addBook(Book b, int numberOfCopies) {
        map.put(b, numberOfCopies);
    }
}
