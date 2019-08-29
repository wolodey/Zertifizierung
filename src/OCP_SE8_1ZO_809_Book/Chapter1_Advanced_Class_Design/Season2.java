package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 21.02.2017.
 */
public enum Season2 {
        WINTER{
            public void printHours() {
                System.out.println("9am-3pm");
            }}, SPRING {
                public void printHours() {
                    System.out.println("9am-5pm");
                }}, SUMMER {
                    public void printHours() {
                        System.out.println("9am-7pm");
                    }}, FALL {
                        public void printHours() {
                            System.out.println("9am-5pm");
                        }};
        public abstract void printHours();
}
