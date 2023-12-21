package PriorityQueueDemonstration;

import java.util.PriorityQueue;
public class PQTest {
    public String getNaturalOrder;
    PriorityQueue<String> pq;
    
    public PQTest(String test) {
        pq = new PriorityQueue<String>();
        String[] split = test.split(" ");
        for (int i = 0; i < split.length; i++) {
            pq.add(split[i]);
        }
    }
    
    public String getMin() {
        return pq.peek();
    }
    
    public String getNaturalOrder() {
        String alphabet = "";
        while (pq.isEmpty() == false) {
            alphabet += pq.remove() + " ";
        }
        return alphabet;
    }
}
