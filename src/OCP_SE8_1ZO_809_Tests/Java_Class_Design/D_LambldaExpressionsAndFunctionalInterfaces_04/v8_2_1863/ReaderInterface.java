package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1863;

/**
 * Created by WSteinle on 22.03.2017.
 */
@FunctionalInterface
public interface ReaderInterface {
    //void read(Book b);

    //default void unread(Book b) {}

    void unread(Book b);
    default void read(Book b) {}

}
