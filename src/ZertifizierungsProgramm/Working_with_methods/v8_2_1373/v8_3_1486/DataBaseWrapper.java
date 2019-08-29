package ZertifizierungsProgramm.Working_with_methods.v8_2_1373.v8_3_1486;

/**
 * Created by WSteinle on 09.02.2017.
 */
public class DataBaseWrapper {
    static String url = "jdbc:7///";
    static DataBaseWrapper getDatabase(){
        System.out.println("Getting DB");
        return null;
    }


    public static void main(String[] args) {
        DataBaseWrapper bd = null;
        System.out.println(bd.url);
     //   System.out.println(getDatabase().url);
    }
}
