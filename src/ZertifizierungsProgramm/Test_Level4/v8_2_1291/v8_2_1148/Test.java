package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_1148;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class Test {
    public int luckyNumber(int seed) {
        if(seed > 10) return seed%10;
        int x = 0;
        try {
            if(seed%2 == 0) throw new Exception("No Even no.");
            else return x;
        } catch (Exception e) {
            return 3;
        } finally {
            return 7;
        }
    }



    public static void main(String[] args) {
        int amount = 100, seed = 6;
                switch(new Test().luckyNumber(6)){
                    case 3: amount = amount * 2;
                    case 7: amount = amount * 2;
                    case 6: amount = amount + amount;
                        default:
                }
        System.out.println(amount);


    }
}
