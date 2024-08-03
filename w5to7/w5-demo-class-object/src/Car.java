public class Car {

  private static int count = 0; //<<share俾object variable
  private int id;
  private String colour;


  //Constructor can access static variable
  public Car(String colour){
    this.id = count++;  //object 會搵到佢, 
    this.colour = colour;
  }


  // public void setColour(String colour){
  //   this.colour = colour;
  // }

  // public String getColour(){
  //   return this.colour;
  //}

  public int getId(){
    return this.id;
  }
  


  public static void main(String[] args) {
    //Car c1 = new Car(1,"RED");  // want to auto gen the id , we can change this.id = count++ as auto gen.

    Car c1 = new Car("RED");
    Car c2 = new Car("Yellow");

    System.out.println(c2.getId());
  }
  
}
