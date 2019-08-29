package ZertifizierungsProgramm.Working_with_methods.v8_2_1373.v8_2_1451;

/**
 * Created by WSteinle on 09.02.2017.
 */
public class Bandwidth {
    public int available = 0;
    public int getAvailable() {
        return available;
    }
    public Bandwidth(int qouta) {
        this.available = qouta;
    }
    public void addMore(int more) {
        available += more;
    }

    public static void main(String[] args) {
        Bandwidth bw = new Bandwidth(100);
        //bw.available = 0;
        bw.addMore(-bw.getAvailable());
        System.out.println(bw.getAvailable());


    }
}
