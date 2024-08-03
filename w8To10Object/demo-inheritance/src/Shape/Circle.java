package Shape;

import java.math.BigDecimal;

//Shape is a class containg area() abstract method
//Circle is a class inherit Shape class   
//2D range 

  public class Circle extends Shape{
 // public final class Circle extends Shape{}
    // if use "final class", it cannot be extended
    //public final class 

  private double radius; //raw data: adjustbule

  public Circle(double radius){
    this.radius = radius;
  }
  //abstract method is not allowed in normal class
  //public abstract String test();

  //1.the parent class has the same method.
  //2. compile would check if the parent class really has the same method.

  @Override  //when parents have this method please use override 
  public double area(){
    //return this.radius * this.radius * Math.PI;
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  //if final double area(), the mini circle also cannot be use 
  //"final method" cannot be overrided in child class

//Circle.class may have its own method
public void sleep(){
  System.out.println("Circle is sleeping");
}

public double getRadius() {
  return this.radius = radius;
}

//static method.  technical is OK, should be /shouldnt?
public static double CircleArea(double radius){
  return BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
}

//can move to Class Shape. 


  public static void main(String[] args) {
    Circle c1 = new Circle(3.0);
    System.out.println(c1.area());
    //How child call parents 
  //   Circle mm = new MiniCirle(24, "Red");
  //   System.out.println(mm.getRadius());
  //   System.out.println(mm.area());
   }
}
  

