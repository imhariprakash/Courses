import java.util.PriorityQueue;

public class TestPriorityQueue {

  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    pq.add(100);
    pq.add(10);
    pq.add(1);
    pq.add(1000);
    pq.add(10000);
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq);
  }
}
