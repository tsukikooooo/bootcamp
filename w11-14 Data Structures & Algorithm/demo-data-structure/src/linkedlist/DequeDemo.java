package linkedlist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DequeDemo {  //頭尾都可拎野合約
  public static void main(String[] args) {
    Deque<String> strings = new LinkedList<>(); //夠用就得, 唔洗亂用deque
    strings.add("abc");
    strings.add("def");
    strings.addFirst("hello"); //use this better in deque
    strings.addLast("world");
    System.out.println(strings);

    strings.peek(); //same as peekFirst()
    System.out.println(strings);
    System.out.println(strings.peekFirst());
    System.out.println(strings.peekLast());

    strings.remove();//same as removeFirst()
    strings.removeFirst();
    System.out.println(strings);
    strings.removeLast();
    System.out.println(strings);

    //Deque interface extends Quene interface
    //so it supprts add(), remove(), size(), etc
    //LinkedList 背後object 連Object...

    //ArrayDeque.class
    
    //用arraydeuqe 指你所你想下面用array  有無用exception 你要淋左邊,  
    //****10**** 1. DS, 2.Object as like(character).? DS: underlying data structure..
    Deque<String> strings2 = new ArrayDeque<>(); //底層係creat new array... // undelying DS -> array -> fixed length
    strings2.add("abc"); // create new array object and then put string object into the array.
    strings2.add("def"); // same step here...
    strings2.addFirst("xyz");
    strings2.addFirst("xyz");
    strings2.removeFirst();
    strings2.removeLast();
    System.out.println(strings2);

    Queue<String> strings3 = new ArrayDeque<>();  // means u 唔係兩頭拎野....present結果需要順序.. //Coding Presentation
    strings3.add("apple"); //係尾入
    strings3.add("banana");
    strings3.remove();
    System.out.println(strings3);  //寫code岩岩好夠用....

    Collection<String> string4 = new ArrayDeque<>(); //可以用, 但用得既function 好小, 好晒
    List<String> string5 = new ArrayList<>(); //係咩特野, 或暗示就正正常常依個... 要插隊岩用
    string5.add("abc");
    string5.add("def");
    string5.add(1,"apple"); //insert (linkList都可做到)
    System.out.println(string5);// [abc, apple, def]

    //Which one is first? ArrayList or LinkedList? 
    //best //worse 
    //頭: Linked List 理論快, 除非你得好小數, 都係LinkedList 快D..加note?理論上優勝
    //**DS */

    //L54: before "RUN": sting4 -> deque, compiler: dont know Collection dont hv addFirst...
    //**underlying VS DS  */
 
  }
  
}
