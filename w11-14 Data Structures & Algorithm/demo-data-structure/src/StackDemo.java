import java.util.List;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    //Last-in, First-out
    Stack<String> ss = new Stack<>();
    ss.add("hello");
    ss.push("world"); //in heap ,push() same as add()
    ss.push("abc");
    System.out.println(ss.pop()); //abc, = remove and return the last element
    System.out.println(ss.pop()); // world 

    ss.push("bbb");
    System.out.println(ss);//[hello, bbb] no sorting.

    List<String> ss2 = new Stack<>(); //list no push(), pop() , so stack cannot use
    //ss2.push();
    //ss2.pop();
    ss2.add("hello");
    ss2.add("abc"); 
    ss2.remove("abc");  // = equals()
    System.out.println(ss2); //[hello]
  
  }
}
