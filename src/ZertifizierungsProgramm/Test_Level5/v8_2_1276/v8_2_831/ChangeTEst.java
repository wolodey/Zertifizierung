package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_831;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class ChangeTEst {
    private int myValue = 0;

    public void showOne(int myValue) {
        myValue = myValue;
        System.out.println(this.myValue);
    }

    public void showTwo(int myValue) {
        this.myValue = myValue;
        System.out.println(this.myValue);
    }

    public static void main(String[] args) {
        ChangeTEst ct = new ChangeTEst();
        ct.showOne(100);
        ct.showTwo(200);
    }
}
