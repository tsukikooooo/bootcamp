public class DemoNumber {
  public static void main(String[] args) {
    Integer x =1;  //1 int value (primitive ) >> Integer Object
    Double d = 2.0;

    Number n = x; //polymorphism ch 17  
    //n is object reference.

    n = d;  //if Integer n = x ,,CANNOT 欲ｃｏｚ they are brother, 
    //if Number n = d is OK

    Number[] numbers = new Number[] {1,2,3,4.0,4.5, (byte)1, (short)3, 4L};
    //Double[] doubles = new Double [] {1,2,3,4.0,4.5}; // int > Integer (Auto Box)
    // Integer VS Double (No relationship)
    //int VS double (upcast)
    
    Double[] doubles = new Double [] {Double.valueOf(1),4.0,4.5}; //double object is not a double primivate

    //For-each
   // for ( object type : array object )  
   for (Number num : numbers){  //Number 大指針, 佢指住child object.
    System.out.println(num); // 1 2 3 4.0 4.5
    System.out.println(num.getClass());//
    // class java.lang.Integer

    // class java.lang.Integer
    // 3
    // class java.lang.Integer
    // 4.0
    // class java.lang.Double
    // 4.5
    // class java.lang.Double
   }
  }
}
