package DemoAbstraction;

public class Human extends SuperHuman implements Walkable, Readable{ // like this 2 contract , j 
  //Class can only inherit instance methods, instance variables.
  //Constructor CANNOT be inherited.

  public Human(){  //<< why cannot use empty constructor?  if you want it you need to call, not inherited, 
    
  }

  public Human(double height){
    super(height); //SuperHuman's constructor
  }
  @Override
  public void walk(){
    System.out.println("Human is walking...");

  }

  // @Override   //coz none change if have change need , overide.
  // public double getHeight(){
  //   return super.getHeight()
  // }

  public static void main(String[] args) {
    System.out.println(Walkable.AGE); // 3 , public static final 

    Human h1 = new Human();
    h1.walk();  // 似absell class X adjustbile

    //human hv run , not effect, no need to care about contract to change yourself
    h1.run();
  
    Superman superman = new Superman();
    superman.run(); // Superman is running ...

    Walkable.swim();
    //default static void read() {
      //System.out.println(""); /// default 係俾人用黎繼承, 唔係俾人用STATIC.
    }
    
  }
  

