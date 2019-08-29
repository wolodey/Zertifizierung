package OCP_SE8_1ZO_809_Book;

/**
 * Created by WSteinle on 20.02.2017.
 */
public class Test {

    int idNumber = 4;
    int age = 2;

    public int hashCode() {
        return idNumber * 7 + age;
    }

    private static double [][] transponVector(double [][] mass) {
        double[][]res = new double[1][mass.length];
        for(int i = 0; i < res[0].length; i++) {
            res[0][i] = mass[i][0];

        }
        return res;
    }
    public static void main(String[] args) {

        double [][] testArray = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};

        double[][] res = transponVector(testArray);

        System.out.println(res[0][0]);
        System.out.println(res[0][1]);
        System.out.println(res[0][2]);
    }
}
