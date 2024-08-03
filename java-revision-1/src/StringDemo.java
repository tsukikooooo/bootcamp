import java.math.BigDecimal;

public class StringDemo {
  public static void main(String[] args) {
    String s = "hello";
    String s2= s.concat("world"); // concat() return new String Object, no impact to s
    System.out.println(s);  //hello 重係到 << Immuntable
    System.out.println(s2);
    //s2 os an object reference, helping you to remain the way to find the Object


    StringBuilder sb = new StringBuilder("hello"); //改變緊狀麃
    sb.append("world"); //You dont have to save the address of sb.coz you already the value stored inside object
    System.out.println(sb);//helloworld  , retrun this. 改變自己 
    sb.append("!!!!");
    System.out.println(sb); //helloworld!!!!

    //As a developer , u have to figure out the impact of each instance method of each class.

    //BigDecimal
    BigDecimal bd = BigDecimal.valueOf(3.3);
    BigDecimal bd2 =  BigDecimal.valueOf(3.4);
    bd.add(bd2); //有冇改變自己?  you have to worry about the impact on bd. Is bd 6.7?
    // 唔會被修改

    BigDecimal bd3 = bd.multiply(BigDecimal.valueOf(2.0));
    System.out.println(bd3.doubleValue); //6.6 writeing class>> insinder method, all code need to change

  }
  
}
