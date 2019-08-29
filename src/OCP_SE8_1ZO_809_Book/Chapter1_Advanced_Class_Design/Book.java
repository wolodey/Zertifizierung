package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 10.11.2017.
 */
public class Book {
    private int ISBN;
    private String title, author;
    private int pageCount;
    public int hashCode() {
        return ISBN;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        return this.ISBN == other.ISBN;
    }
}
