import java.math.BigDecimal;

public class Calculator {

  private int x;
  private int y;

  // Static method -> instance method ?! >>other world , separate place, who can call, public.
  // not private object.

  public static int sum(int x, int y) {
    return x + y;
  }

  public static double sum(double x, double y) {
    System.out.println("sum(double x, doubley is runnning...)");
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();

  }

  public static double sum(float x, double y) { //<<? need to check again.
    System.out.println("sum(float x, doubley is runnning...)");
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();

  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int sum() {
    return this.x + this.y;
  }

  public int multiply() {
    return this.x * this.y;
  }

  //// .... 用法
  public static void test(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);

      //Class area , separate not heap memory  
      //Calculator.sum(int x, int y)

      //** 另一個空間 */

    }



  }

  public static void test2(String... args) { // string ...> string[]!!! SAME
    // for each
    for (String s : args) { // 唔洗i++時先用得
      System.out.println(s); 

    }

  }

 public void getX(int x){
   this.x = x;
 }


  public static void main(String[] args) {

    // sys out 合理用static method
    // static methods
    sum(1, 3);
    Calculator.sum(2, 3);

    Calculator c1 = new Calculator();
    c1.setX(2);
    c1.setY(3);

    c1.sum();
    c1.multiply();

    // int>>static
    // static >> int

    // Method overloading
    sum(1, 2); // coz you are passing int value , so over laoding determinte
    // " public stat int sum (int x, int y)" should be called
    sum(1.0, 2.0);
    // sum(double x, double y) is called

    sum(1.0f, 2.0f);  //搵唔到時, 令自己升級去搵
    // upcast >> promotion (XX int ) coz you didnt said down cast , so upcast.
    // sum(double x, double y) is called.

    // String 都係over loading ---- 行為有參數, 不用因為唔同type 而夾硬就佢 , 關心XX?本身 ?
    String.valueOf(10L); // "10"
    String.valueOf(new char[] {'a', 'b', 'c'}); // "abc"

    Calculator.test(new String[] {"abc", "ijk"});
    Calculator.test2(new String[] {"abc", "ijk"});
    Calculator.test2("abc", "ijk"); // can call  same as line 98. 

    //write Class 2 X >> git hub,, any arry in your class //main .test program,  DAY, as attribute , but BIGDEIMAL not recommend
    //static method...make sense? write some.like cal. 


    //static
    Calculator.sum(3,2); //5   static method
    //new Calculator().setX(3); //可以繼續CALL 捉住x , 想SET Y 時, 要再抄或object reference. 先可以, 所以依家SET唔到.

    Calculator x = new Calculator();
    x.setX(3); //instance method
    x.setY(2); //instance method
    System.out.println(x.sum()); // 5

    System.out.println(x.sum(3,2)); // call static method
    //object reference is able to cal static method.
    // 唯一公家, 唔可能搵到private so ask 

    //Calculator.sum(); //object can call sum reason  <<<<< instance method cannot called by Class name.
    //Static method can be called by instance (object) or Class Name
    //Instance method can be only called by instance (object) ONLY.
  }
}
