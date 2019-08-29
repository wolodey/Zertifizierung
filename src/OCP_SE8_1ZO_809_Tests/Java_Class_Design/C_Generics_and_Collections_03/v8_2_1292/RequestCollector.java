package OCP_SE8_1ZO_809_Tests.Java_Class_Design.C_Generics_and_Collections_03.v8_2_1292;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class RequestCollector {

    // Queue container = new PriorityQueue();
    Queue<Request> container = new LinkedList<Request>();
    public synchronized void addRequest(Request request) {
        container.add(request);
    }

    public synchronized Request getRequestToProcess() {
        return container.poll();
    }
}
