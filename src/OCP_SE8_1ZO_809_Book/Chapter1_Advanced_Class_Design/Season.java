package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 21.02.2017.
 */
public enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
   // WINTER, SPRING, SUMMER, FALL
    private String expectedVisitors;

    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}
