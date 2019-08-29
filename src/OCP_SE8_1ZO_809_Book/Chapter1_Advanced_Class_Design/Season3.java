package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 21.02.2017.
 */
public enum Season3 {
    WINTER {
        public void printHours() {
            System.out.println("short hours");
        }
    }, SUMMER {
        public void printHours() {
            System.out.println("long hours");
        }
    }, SPRING, FALL;
    public void printHours() {
        System.out.println("default hours");
    }
}
