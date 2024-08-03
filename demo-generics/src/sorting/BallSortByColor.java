package sorting;

import java.util.Comparator;

public class BallSortByColor implements Comparator<Ball> { //要打返個T
  
  //RED > BLACK > WHITE
  @Override
  public int compare(Ball b1, Ball b2){ //-1,將B1放左邊, 1: B2放左邊
    if (b1.getColor() == Color.Red)
      return -1; 
    if (b1.getColor() == Color.BLACK && b2.getColor()== Color.White)
      return -1; 
    if (b1.getColor() == Color.BLACK&& b2.getColor() == Color.Red)
     return 1; 
    if (b1.getColor() == Color.White)
     return 1;
    return 1;
  }
  
  
}
