package OCP_SE8_1ZO_809_Tests.Java_Class_Design.C_Generics_and_Collections_03.v8_2_1830;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class Book {
    String isbn;
    String title;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public int compareTo(Book book) {
        return this.isbn.compareTo(book.isbn);
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("1", "HAH"));
        books.add(new Book("8", "AAA"));
        books.add(new Book("7", "ZZZ"));

        Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
//        Collections.sort(books, (b1, b2) -> b1.getIsbn().compareTo(b2.getIsbn()));

        for (Book book : books) {
            System.out.println(book.getTitle());
        }

        List<Integer> valuesToSort = new ArrayList<>();
        valuesToSort.add(2);
        valuesToSort.add(5);
        valuesToSort.add(4);
        valuesToSort.add(1);

        Collections.sort(valuesToSort);
        for (Integer value : valuesToSort) {
            System.out.print(value + " ");
        }
    }

}
