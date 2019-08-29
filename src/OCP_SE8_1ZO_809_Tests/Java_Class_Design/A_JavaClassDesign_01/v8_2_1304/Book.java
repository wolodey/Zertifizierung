package OCP_SE8_1ZO_809_Tests.Java_Class_Design.A_JavaClassDesign_01.v8_2_1304;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class Book {

    private String isbn;

    public Book(String isbn) {
        this.isbn = isbn;
    }

  /*  public boolean equals(Object o) {
        return (o instanceof Book && ((Book) o).isbn.equals(this.isbn));
    }*/

  /*  public int hashCode() {
        return 100;
    }*/

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
