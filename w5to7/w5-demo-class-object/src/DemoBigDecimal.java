import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double x = 0.2;
    double y =0.1;
    System.out.println(x*y); //0.02000000004

    BigDecimal b1 = new BigDecimal("0.2"); // 小數要用依個, 整數先可以用返primiva
    BigDecimal b2 = new BigDecimal(("0.1")); // use method to solve

    BigDecimal b3 = b1.multiply(b2);
    System.out.println(b3.doubleValue()); //0.02

    System.out.println(sum(0.2, 0.1));//0.3 
    System.out.println(0.2 + 0.1 ); //0.3000000000004 << 正常唔可以就咁加上上去

    System.out.println(sum(14.2,2));
    System.out.println(divide(9.9, 3.0)); //3.3
    System.out.println(divide(9.9,3.2));//3.09375 >>> 3.094
    System.err.println(divide(10, 3)); //3.4

    //d1.substract().multyiply
    System.out.println(BigDecimal.valueOf(3.3).subtract(BigDecimal.valueOf(1.1).add(BigDecimal.valueOf(4.4)))); //6.6
  }

  public static double sum(double d1, double d2){
  //  return d1 + d2  // XXX 
    BigDecimal b1 = BigDecimal.valueOf(d1);  //valueOf : 
    BigDecimal b2 = BigDecimal.valueOf(d2);
    return b1.add(b2).doubleValue();

    // subtract().multiply()  << try

    //System.out.println("hello"); //1ms <<<leetcode test over 1ms 
    
  }

  //divide 
  public static double divide(double d1, double d2){
////strange....."?"
    return BigDecimal.valueOf(d1).divide(BigDecimal.valueOf(d2), RoundingMode.UP).setScale(3,RoundingMode.UP).doubleValue(); 
    //handle non terminating decimal expansion(i.e 10/3)
    
    // decmical place, the way to round the result
    
    //convert from BigDecimal to double
    
    // decmical place, the way to rounding
    
  }
}
