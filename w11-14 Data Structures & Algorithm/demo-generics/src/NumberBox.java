import java.math.BigDecimal;

public class NumberBox<T extends Number> {
  private T number;
  
  public NumberBox (T number){
    this.number = number;
  }

  public static void main(String[] args) {
    NumberBox<Byte> byteBox = new NumberBox<>((byte)1); // int-> byte -> Byte
    //Long extends Number and Byte extends Number
    //byteBox = new NumberBox<Long>(); NOT OK,,coz NumberBox no relationship with NumberBox<Long>
    NumberBox<BigDecimal> bBox = new NumberBox<>(BigDecimal.valueOf(3.4));
    //why use extends, polymoiusm? generics kara
  }
  
}
