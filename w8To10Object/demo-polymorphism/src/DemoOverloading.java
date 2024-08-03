public class DemoOverloading {

  //Overloading do not have relation with object reference.
  //static ge polymolyism 

  private int a;
  private int b;

  public DemoOverloading() { //default value
    // this.a = 100;
    // this.b = 20;

    //Alternative (Overloading)
    this(100.2,100.2);  //DemoOver loading (double a, double b) 
  }

  public DemoOverloading (int a) { //user give
    this.a = (int)a;
    this.b = 100;   //downstep is overloading ver

    //Alternative (Overloading)
    //this(a, 100.2) //DEmoOverlaoding(double a, double b)

  }

  public DemoOverloading(int a, int b){
    this.a = a;
    this.b = b;
  }
public DemoOverloading(double a, double b){  //down grape
  this.a = (int)a;
  this.b = (int)b;
}

  // Method Signature = method name + parameter(s)
  public static int sum(int x , int y){  //change to instance method. add "static"
    return x + y;
  }

  public static double Double(int x, int y){ //Duplatie method.
    return x + y;
  }

  public static double sum(double a , double b){  //change to instance method. add "static"
    return a + b;
  }

  public static long sum(int x, long y){ //調左位都當新method. java will check the actual  (complier time has already know)
    return x + y;
  }

  
  public static long sum(long x, int y){
    return x + y;
  }

public static void sum (Object x, Object y ){
  System.out.println("calling void sim (Object x, Object y)");
}

  public static void main(String[] args) {
    //purpose of Overloading:
    //The design of overloading for methods is to let user (method user) easier to use.
    //Overloading is designed and checked during compile time.  


    //Example 1 

    String a =  String.valueOf(true);//true  // user行先
    String b = String.valueOf(2.0d); //2.0
    char[]arr = new char[] {'c','b','a'};
    System.out.println(String.valueOf(arr)); //"cba"

    //Example 2
    System.out.println(sum(1,2)); //3
    System.out.println(sum((byte)3, (short)9)); //12 or 12.0? why? ANS: 12 coz call sum(int x, int y) //
    System.out.println(sum((byte)3, (short) (9)));

      sum("abc", "bcd"); //參數數量2 係極端? >> calling void sum(Object x , Object y)

      System.out.println(sum(10L,12L));// 22.0 Long primitive >> double..**

      sum(new(Cat(), new Dog())); // 會去左animals先, 次序級別的rule

      //What is the method parameters are with type of Wrapper Class? like wrapper class long and can transit or not?
      //try try.
  }
}
