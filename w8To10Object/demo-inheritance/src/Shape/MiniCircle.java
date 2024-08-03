package Shape;

public class MiniCircle extends Circle {

  private String color; //teramake minicircle have color

  //可以NEW GE 野就終結所有野, PUBLIC
  //終結左唔代表 仔唔可以重寫

  public MiniCircle(double radius, String color){
    super(radius);
    this.color = color; // coz color is youself not paraents
  }
 // @Override
 // public double area(){
 // }

  public static void main(String[] args) {

    //paint below 3 statmenths. ,like person as example
    MiniCircle mc = new MiniCircle(3.0d, "purple");  
    System.out.println(mc.getRadius());
    System.out.println(mc.area()); //call the method.
  }
  
}
