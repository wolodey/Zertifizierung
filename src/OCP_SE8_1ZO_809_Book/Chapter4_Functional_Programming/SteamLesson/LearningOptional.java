package OCP_SE8_1ZO_809_Book.Chapter4_Functional_Programming.SteamLesson;

import java.util.Optional;

/**
 * Created by WSteinle on 16.03.2017.
 */
public class LearningOptional {
    public static Optional<Double> average(int ... scores) {
        if(scores.length == 0) return Optional.empty();
        int sum = 0;
        for(int score : scores)
            sum += score;
        return Optional.of((double) sum / scores.length);
    }
    public static void main(String[] args) {
        Optional<Double> optional = average(90, 100);
        System.out.println(optional.get());

    }
}
