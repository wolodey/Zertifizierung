package TestPackage.SampleQuestions;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class SampleQuestion {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
       // System.out.println(s1);
        s1.substring(4);
        //System.out.println(s1.substring(4));
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }
}
