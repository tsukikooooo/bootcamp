package DemoAbstraction.Shape;

public class ShapeManager {
  private Shape shape; //attribute can be an interface

  //Design implication
  // You should put an object which implemented the contract (interface)
  //so that the parameter object MUST contain area() method.
  //like cat no .area() ,, 
  public ShapeManager(Shape shape){
    this.shape = shape;
  }
  public void setShape(Shape shape){
    this.shape=shape;
  }
  //During compile time, Java gurantee obj is able to call area() method.
  public boolean isTooBig(){
    return this.shape.area() > 20.0;  //L10 between L18 relation (V ver: L9 , L19)
  }

  public static void main(String[] args) {
    Shape circle = new Circle(3.0);
    ShapeManager shapeManager = new ShapeManager(new Circle(3.0));//拍針, 拍住OBJECT (NEW CIRCLE)
    System.out.println(shapeManager.isTooBig()); //true

    shapeManager.setShape(new Square(4.0));
    System.out.println(shapeManager.isTooBig()); //false 

    //check the relationship between shape and square
    //beauty? v said. 

  }
  
}
