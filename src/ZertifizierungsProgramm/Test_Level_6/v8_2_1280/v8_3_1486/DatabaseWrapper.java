package ZertifizierungsProgramm.Test_Level_6.v8_2_1280.v8_3_1486;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class DatabaseWrapper {
    static String url = "jdbc://derby://localhost:----";
    static DatabaseWrapper getDatabase() {
        System.out.println("Getting DB");
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getDatabase().url);
        System.out.println(new DatabaseWrapper().url);

    }
}
