package sorting;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Objectives: learn existing interface
public class Ball implements Comparable<Ball> { 
  private int number;
  private Color color;

  public Ball(int number, Color color) {
    this.number = number;
    this.color = color;
  }

  public int getNumber() {
    return this.number;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public int compareTo(Ball ball) {
    // Objectives: provide your own formula to sort the List<Ball>
    // Return Value : 1 or -1, depends caller how to define.

    // Example 1: sort by number (descending)
    // U hv 2 ball object reference here: ball and this(你自己)
    // -1 means "move to left"(from left to right) sort first element 行先, 排先,
    // if (ball != null && this.number > ball.getNumber())     // 留意當有null就會爆炸, 所以要打左ball!=null &&, &&>當用時 前者岩, 後者就停
    //  return -1;
    // return 1;

    //Example 2: // Sort by colour , RED > WHITE > BLACK, if same colour, larger number go first.

    if (ball != null
        && this.color.name().charAt(0) < ball.getColor().name().charAt(0)) // 留意當有null就會爆炸, 所以要打左ball!=null &&, &&>當用時 前者岩, 後者就停
      return 1;
    else if (ball != null
        && this.color.name().charAt(0) > ball.getColor().name().charAt(0))
      return -1;
    return this.number > ball.getNumber() ? -1 : 1;


  // //Excercise 3: sort by colour then number
  //     if(ball!=null && this.color.name().charAt(0)<ball.getColor().name().charAt(0))
  //       return -1;
  //     else if (ball!=null && this.color.name().charAt(0)>ball.getColor().name().charAt(0))
  //       return 1;
  //       return this.number> ball.getNumber() ? -1 : 1;
   }

  public String toString() {
    return "Ball(" //
        + "Colour=" //
        + this.color //
        + ", Number=" //
        + this.number //
        + ")";
  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(10, Color.BLACK));
    balls.add(new Ball(14, Color.White));
    balls.add(new Ball(8, Color.Red));
    balls.add(new Ball(30, Color.BLACK));
    balls.add(new Ball(15, Color.Red));
    System.out.println(balls); // [the first10colour10, the first14colour14, the first8colour8]
    //

    // Sort
    // Collections.sort() -> call 你提供list OBJECT COMPARE TO ( 用FOR LOOP CALL) // call Loop List<Ball> -> ball.compareTo()
    // During Compile
    //approach 1
    Collections.sort(balls); // (List <T>) arrayList/LinkedList //O(log(n))--> check merge sort  , Collections: Class , 你放緊址址入去..,array link object入面指住個ball()
    System.out.println(balls); // [the first14colour14, the first10colour10, the first8colour8]

    // List<Bird> birds = new ArrayList<>();
    // Collations.sort(birds); //error,Bird. class did not implent


    // Sort by colour , RED > WHITE > BLACK, if same colour, larger number go first.



    // sort by colour then number

    //Approach 2  //Compartor 可以不同formular 自己簡黎call. , Compartor 好處; 橫向擴展
    balls.add(new Ball(1003, Color.BLACK));
    balls.add(new Ball(198, Color.Red));
    int x = 3;
    Comparator<Ball> formula = null;
    if(x >= 3){
      formula = new BallSortByColor();
    }else {

    }
    Collections.sort(balls, new BallSortByColor());
    System.out.println(balls);

  }
}
