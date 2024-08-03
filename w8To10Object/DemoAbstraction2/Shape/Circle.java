package DemoAbstraction.Shape;

import java.math.BigDecimal;
import java.util.concurrent.BlockingQueue;

public class Circle implements Shape{
  
  public double radius;
  public Circle(double radius){
    this.radius = radius;
  }
  @Override
  public double area(){
    return BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }
  
  public static void main(String[] args) {
    Circle c1 = new Circle(8);
    System.out.println(c1.area());
  }
}
