package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency.SynchronizedCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet()) {
            foodData.remove(key);
        }
    }
}
