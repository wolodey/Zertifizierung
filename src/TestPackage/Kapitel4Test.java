package TestPackage;

/**
 * Created by WSteinle on 13.01.2017.
 */
public class Kapitel4Test {

    public static int LENGTH = 5;
    static {
        LENGTH = 10;
    }

    public static void swing() {
        System.out.println("swing ");
    }



    public static int number (int number) {
        number ++;
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return  letters;
    }

    public static void main(String[] args) {
        System.out.println(LENGTH);
        int number = 1;
        String letters = "abc";
        number (number);
        letters = letters(letters);
        System.out.println(number + " " + letters);


        double resdouble = round(111.2, -2);
        System.out.println(resdouble);
    }

    public static double round(double number, int scale) {

        if (scale == 0) {
            double tmp = number;
            return (int)((tmp - (int)tmp) >= 0.5f ? tmp + 1 : tmp);
        }
        if (scale > 0) {
            int pow = 10;
            for (int i = 1; i < scale; i++) {
                pow *= 10;
            }

            double tmp = number * pow;
            return (double)(int)((tmp - (int)tmp) >= 0.5f ? tmp + 1 : tmp) / pow;
        } else {
            int pow = 10;
            for (int i = 1; i < Math.abs(scale) + 1; i++) {
                pow *= 10;
            }
            return round(number / pow, 1) * pow;
        }

    }
}
