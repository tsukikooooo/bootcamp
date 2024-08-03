public class DemoEnum { //like public static final
  
  //Constant (finite)
  //Current
  //Weekday
  public static final String monday = new String("MONDAY"); //never change just use class.monday
  public static final String tuesday = "TUESDAY";
  public static final String wednesday = "WEDNESDAY";
  public static final String thurday = "THURDAY";
  public static final String friday = "FRIDAY";
  public static void main(String[] args) {
    System.out.println(DemoEnum.monday); //MONDAY
  

    //What happen in heap memory?
    //Answer: static variable would not point to object

    //Before executing the main method being executed , it loads enum class
    System.out.println(Weekday.MONDAY); //背後都係call ToString 
    //sysout >> calling Weekday MONDAY toString()
    //Enum 背後overide 左, 背後野, 自己
    //by deafult Weekday.class already @Override toString()
    System.out.println(Weekday.TUESDAY);

    //Other example "Cooridnat " , whats is the useful ?
    int direction = 2;
    if(direction == east){  //ENUM always use == , equals is same, no need to use.

    }

    Direction d = Direction.EAST;
    if (d == Direction.SOUTH){   
      //compare object address ..
    }
  }
}
