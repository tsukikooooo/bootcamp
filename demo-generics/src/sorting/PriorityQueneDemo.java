package sorting;

import java.beans.Customizer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.print.attribute.standard.QueuedJobCount;

public class PriorityQueneDemo {

  public static void main(String[] args) {
    Queue<String> pq = new PriorityQueue<>();  //X Deque   
    pq.add("def"); //sorting, [def]
    pq.add("abc"); //sorting, [def,abc] - > [abc,def]
    pq.add("bbb"); // sorting, [def, abc, bbb] - > [abc,bbb,def]
    pq.add("aax"); //每一次都sort

    System.out.println(pq); //[aax, abc, bbb, def], 每一次都sort !! so add() method does not perform sorry

    //while
    while (!pq.isEmpty()) {
      System.out.println(pq.poll()); //auto sorting.b, complete sorting when you call poll() method
      
    }

    List<String> pq2 = new LinkedList<>(); //coz List 無範圍?
    pq2.add("def"); //sorting, [def]
    pq2.add("abc"); //sorting, [def,abc] - > [abc,def]
    pq2.add("bbb"); // sorting, [def, abc, bbb] - > [abc,bbb,def]
    pq2.add("aax");
    System.out.println(pq2);  //做左一次Sort 最尾一次過sort  [def, abc, bbb, aax]
   // Collections.sort(pq2)//error, did not implement comparable
    //1. Javaj 8 >Stream (List)
    //2. Convert to Array - > Arrays.sort
   
    // 應該用邊個sort? Quene<> ? List<> 
    Queue<Integer> pq3 = new PriorityQueue<>(); //Link leist  都有
    pq3.add(12);
    pq3.add(256);
    pq3.add(273);
    pq3.add(-133);
    System.out.println(pq3.poll());//-133  //得返依條路拎野, 
    //poll() -> ordering
    pq3.add(-400);
    System.out.println(pq3.poll());//-400
    System.out.println(pq3.poll());//12
    System.out.println(pq3.poll());//256
    System.out.println(pq3.poll());//273

    //poll () 只係會拎當下, 出下一個element
    //Class -> formula
    //
    Queue<Long> pq4 = new PriorityQueue<>(new LongDescendingOrder()); // () is insert formula
    pq4.add(Long.valueOf(100));
    pq4.add(Long.valueOf(-1111));
    pq4.add(Long.valueOf(529));
    pq4.add(Long.valueOf(-9293));

    //poll
    System.out.println(pq4.poll());
    System.out.println(pq4.poll());
    System.out.println(pq4.poll());
    System.out.println(pq4.poll());

    Queue<Customer> pq5 = new PriorityQueue<>(new CustomerSortByAge());
    pq5.add(new Customer(110));
    pq5.add(new Customer(14));
    pq5.add(new Customer(42));
    pq5.add(new Customer(9));
    pq5.add(new Customer(19));
  }
  
}
