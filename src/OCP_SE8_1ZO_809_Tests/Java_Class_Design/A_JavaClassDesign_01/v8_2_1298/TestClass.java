package OCP_SE8_1ZO_809_Tests.Java_Class_Design.A_JavaClassDesign_01.v8_2_1298;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class TestClass {
    static BookStore bookStore = new BookStore();

    public static void main(String[] args) {
        Book book = new Book();
        book.setIsbn("111");
        bookStore.addBook(book, 10);
        System.out.println(bookStore.getNumberOfCopies(book));

        book = new Book();
        book.setIsbn("111");
        System.out.println(bookStore.getNumberOfCopies(book));
    }
}
