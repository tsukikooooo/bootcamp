import java.util.LinkedList;
import java.util.List;

public class Box {
 private List<Ball> balls; //pria
 private int capacity;

 public Box(){
  this.balls = new LinkedList<>();
  this.capacity = 10;
 }
 
 public List<Ball> getBalls(){
  return this.balls;
 }
 
 public void add(Ball ball){
   balls.add(ball);
  }
  public class Ball{
    public int getCapacity(){
      return capacity; //有D 怪, 因為 自己先係THIS. 依個係因為BALL 同BOX 有連繫 , 弟SIU關係...NOT PARENTS
    }
  }
}
