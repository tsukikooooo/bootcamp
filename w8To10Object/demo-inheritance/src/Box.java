import java.math.BigDecimal;

public class Box {  //Similar to StringBuilder

  private String x;
  public Box(){
    this.x = "";
  }
  public Box append(String y){
    this.x += y;  //放落褲袋, 拎自己出去
    return this;
  }
  //IMPORTANT ****//
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("hello");
    System.out.println(sb); //hello

    Box box = new Box();
    box.append("hello");
    System.out.println(box);

    BigDecimal bd = new BigDecimal(0.0d);
    BigDecimal bd2 = bd.add(BigDecimal.valueOf(1.0d));   //not return this. 
    //new BigDEcimal  0 + 1, >因無接住, 所以 0  ...//add >> create new    接住, 
    System.out.println(bd.doubleValue()); //1.0? NO 0.0
    System.out.println(bd2.doubleValue());
    //褲袋拎出黎, 永遠NEW
  }
}
