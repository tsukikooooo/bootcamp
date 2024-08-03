package Shape;

import java.math.BigDecimal;
import java.sql.ShardingKey;

public abstract class Shape {
  
  //abstract class can create instance method without implementation
  //Method without implementation >> abstract method
  public abstract double area();

  public static double CircleArea(double radius){
  return BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
}

  public static double SquareArea (double length){
    return BigDecimal.valueOf(length).multiply(BigDecimal.valueOf(length)).doubleValue();
  }

  //public static double totalArea(Circle[] circles){
    //..
  //}

  
  // public static double totalArea(Square[] square){
  //   //..
  // }

//ch 17. tomomehyium  
  public static double totalArea(Shape[] shapes){  // circle, square mix tgt array
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes){  // s is obj ref, point to actual object (Circle/Square)
      //s.area();  //<< s. 指sqauare / circle object, not s.area. (heap memory square/circle)
      //no shape. obj
      bd = bd.add(BigDecimal.valueOf(s.area()));   // bd return deciaml , object
      //sting builder return this? 
      //why didint after return didnt return their self
    }
    return bd. doubleValue();
  }

  public static void main(String[] args) {
    System.out.println(Shape.CircleArea(2.5));  // like tool static method. so 
    System.out.println(Square.CircleArea(5.0));

    //declare shapes array
    Shape[] shapes = new Shape[] {new Circle(3.0d), new Square(4.0d), new Circle(10.0)};
    //Why do we have hesiable 
     System.out.println(Shape.totalArea(shapes));

     //extra example  (.>)
     StringBuilder sb = new StringBuilder("hello");
     sb.append("world"); //Java: u don't have to assign the return object to a reference.
     //sb = sb.append("world");  ??   所有method 可以修改自己
     System.out.println(sb);
     //refer to Box.java for the answer.
  }
}
