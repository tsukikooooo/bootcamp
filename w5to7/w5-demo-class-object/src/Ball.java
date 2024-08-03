public class Ball {  

  private double weight;
  private String color; //String >>>  char array
  private int number;
  

  //constructors - empty constructor, all args constructor
  // by default, there is an empty constructor implicitly
  public Ball(){
    this.color ="RED";
  }

  public Ball(double weight, String color){
    this.weight = weight;
    this.color = color;
  }

  public Ball(double weight, String colour, int number){
    this(weight, colour); //會自動追蹤 L14 行GE 所以可以就咁打 都 OK NOTE CH10. 
    this.number = number; 
  }

  //getter, setter
  public double getWeight(){
  return this.weight;
  }

  public String getColour(){
    return this.color;
  }

  

  public void setWeight(double weight){
    this.weight = weight;
  }

  public void setColour(String color){
    this.color = color;
  }

  //toString (instance method)
public String toString(){
return "Ball(" + "weight:" + this.weight + "colour : "+ this.color + ")";
}
  
 public static void main(String[] args) {
  Ball b1 = new Ball();
 System.out.println(b1.getColour()); 
 
  Ball b2 = new Ball(10.2,"Black");
  System.out.println(b2.getWeight());
  System.out.println(b2.getColour());

  System.out.println(b2.toString()); //Ball@36baf30c << obeject reference
 

 Ball b = new Ball(); // "Ball b" >> coz Ball.class is "public class"
 // new ball >> coz constructor is "public"
 b.setColour("Yellow"); 
}
}
