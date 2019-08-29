package ZertifizierungsProgramm.Test_Level_6.v8_2_1280.v8_2_1381;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class TestArrays {
    public static void main(String[] args) {
        int [][] array = {{0}, {0,1}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2, 3, 4}};
        int[] arr1 = array[4];
        System.out.println(arr1[2]);

        for ( int i = 0, j = 10; i < j; i++, --j) {;}
    }
}
