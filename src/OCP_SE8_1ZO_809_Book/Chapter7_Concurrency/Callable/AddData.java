package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

/**
 * Created by WSteinle on 27.03.2017.
 */
public class AddData {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

            ExecutorService service = null;

            try {
                service = Executors.newSingleThreadExecutor();
                Future<Integer> result = service.submit(() -> 30 + 11);

                Supplier<String> resultSupplier = () -> {
                    return "aa";
                };
                System.out.println(resultSupplier.get());
                System.out.println(result.get());
            }finally {
                if(service != null) service.shutdown();
            }
    }

}
