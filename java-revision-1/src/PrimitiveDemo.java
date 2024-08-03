public class PrimitiveDemo {
  public static void main(String[] args) {
    int x =10; //left hand side: x -> variable ,right hand side: int value (assign GE value)
    //compiler check if 10 can be assigned to x

    long l = x;//long range is higher than int type (promotion/upcast)
    short s = x;// short range is lower than int type (downcast＞＞　explicit casting)

    //As a developer, u deceided to adpot the risk of precision loss
    //compiler does not concern the value assigned to x during compile time
    //instead, it concerns the "range" of type of level (SP::char and int 關係)

    //ascii
    int y = 100; //21億
    char c = y;  //char 6萬幾,做downcast
    char c = (char)y; //char value 右邊 > Char Object 
    int z = c;

    //default value 
    long l2 = 0L;  //唔可以唔寫 declaration long l2
    System.out.println(l2); //you cannot use a variable without initialization "long l2;
    
    float f = 0.3f; //we need to use of f after 0.3, because 0.3 is a double value by default
    byte b = 9; //Java still allow int value assigned to byte, short type.
    long l3 = 7L;
    double d2 = 9.3d; //9.3 is also OKAY.
  }
  
}
