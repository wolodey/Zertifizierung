package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 15.11.2017.
 */
public class BaseballTeam_TestAufgabe4 {
    private String city, mascot;
    private int numberOfPlayers;
    public boolean equals(Object obj) {
        if(!(obj instanceof BaseballTeam_TestAufgabe4))
            return false;
        BaseballTeam_TestAufgabe4 other = (BaseballTeam_TestAufgabe4) obj;
        return (city.equals(other.city) && mascot.equals(other.mascot));
    }
    public int hashCode() {
        return numberOfPlayers;
    }


}
