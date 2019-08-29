package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_1239;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class ForSwitch {

    public static void main(String[] args) {
        char i;
        loop: for(i=0; i<5; i++) {
            switch (i++) {
                case '0':
                    System.out.println("A");
                case 1:
                    System.out.println("B"); break loop;
                case 2:
                    System.out.println("C"); break;
                case 3:
                    System.out.println("D"); break;
                case 4:
                    System.out.println("E");
                case 'E':
                    System.out.println("F");
            }
        }

    }
}
