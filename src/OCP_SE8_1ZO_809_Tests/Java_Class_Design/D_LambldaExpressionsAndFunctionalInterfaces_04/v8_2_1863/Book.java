package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1863;

import java.util.Arrays;
import java.util.List;

/**
 * Created by WSteinle on 22.03.2017.
 */
public class Book {
    private String title;
    private String genre;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(new Book("Gone with the wind", "Fiction"),
                new Book("Bourne Ulimatum", "Thriller"),
                new Book("The Client", "Thriller")
        );

        ReaderInterface r = b-> {
            System.out.println("Reading book " + b.getTitle());
        } ;

        books.forEach(x->r.unread(x));


    }

}
