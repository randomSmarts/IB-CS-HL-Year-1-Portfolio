package PriorityQueueDemonstration;

public class PQMain {
    public static void main (String[] args) {
        String test1 = "one two three four five six seven";
        String test2 = "1 2 3 4 5 one two three four five";
        String test3 = "a p h j e f m c i d k l g n o b";

        PQTest pq1 = new PQTest(test1);
        System.out.println("Priority queue order: " + pq1);
        System.out.println("Min: " + pq1.getMin());
        System.out.println("Natural order: " + pq1.getNaturalOrder);
        System.out.println("");

        PQTest pq2 = new PQTest(test2);
        System.out.println("Priority queue order: " + pq2);
        System.out.println("Min: " + pq2.getMin());
        System.out.println("Natural order: " + pq2.getNaturalOrder);
        System.out.println("");

        PQTest pq3 = new PQTest(test3);
        System.out.println("Priority queue order: " + pq3);
        System.out.println("Min: " + pq3.getMin());
        System.out.println("Natural order: " + pq3.getNaturalOrder);
        System.out.println("");
    }
}
