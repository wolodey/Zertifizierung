
/* sdf */
package TestPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by WSteinle on 12.10.2016.
 */




public class _TestClass {

    public final int volume;
    public static int aaaaa = 20;
    _TestClass(int aaaaa) {
        volume = 3;
        this.aaaaa = aaaaa;
    }
    private String name = "Fluffy";
    List<String> list = new ArrayList<String>();

    private static int one;
    private static final int two;
    private static final int three = 3;
    static {
        two = 2;
    }

    public void flyer(int numMiles) {
        System.out.println("int");
    }


    public void flyer(long numMiles) {
        System.out.println("long");
    }




    public static int swert;
    public int wert;

    static int MAX_LENGTH = 5;
    int length;

    public void grow (int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }

    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }

    public void _TestClass(String name) {
        this.name  = name;

    }

    public void fly(int leng) {}
    public void fly(int ... leng) {}

    public void fly (Integer leng) {}

    public static void main(String[] args) {

        int num = 4;
        newNumber(num);
        System.out.println(num);





        int [][] argss = new int [2][];
        int[] as = new int[10];
        int bas = as.length;
        int [] assa = new int [10];
        if(as.equals(assa)) {

        }

        String a = "";
        a += 2;
        a += 'c';
        a += false;
        System.out.println(a);
    }

    public static int newNumber(int num) {

        num = 8;
        return num;
    }
}



