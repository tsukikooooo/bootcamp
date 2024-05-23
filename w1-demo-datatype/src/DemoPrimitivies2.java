import javax.print.attribute.IntegerSyntax;

public class DemoPrimitivies2 {
  public static void main(String[] args) {
    long l1 = 10; // 10>> int value, why 10 didnit as int as long?
    long l2 = 10L; // 10L>>> long value

    // Java: int >> long
    long l4 = 63; // assign int value 63 to long variable l4 (int value >> long value)
    // int i1 = 4L; //cannot assign long value to int variable, coz long is a type hghter than int


    // byte > short > int > long > float > double (level up ranking)
    // char > int (ASCII) upcase
    double d1 = 1.8;
    double d2 = 1.8d;
    double d3 = 10L;

    byte b1 = 10; // OK, why 10 int value >> bype
    // bype and short can be down grade

    // cam only explicity assign a value that with a type higher than the data type.
    float f3 = (float) 1.9d; // XX 不會默認, 你整左要自己咩飛. 精準度> BYTES, DOWNCAST (overflow/ precision loss)

    short s1 = 128;
    byte b2 = (byte) s1; // Java didnt know S1 is 128 during compile time (run time will know this)
    System.out.println("b2=" + b2); // -128 > overflow (overflow means loop +127 >>-128 )
    // is s1 = 129 , print out will be -127 (overflow)

    byte b3 = 127;
    short s2 = b3; // java care about low risk, that why 127 can be short (30000value)

    double d4 = 10.9d;
    int i2 = (int) d4;
    System.out.println("i2=" + i2); // 10 >>> precision loss (精度捐失)

    char c1 = 'a';// 97
    char c2 = 'A'; // 65

    if (c1 == c2) {// false, 97 == 65

    }
    if (c1 > c2) { // true, 97 > 65
      System.out.println("c1 > c2");
      System.out.println("C1= " + (int) c2); // String + int >> string

    }
    int c1iIntValue = c1; // OK, char > int (upcast)
    int charValue = 97;
    char c3 = (char) charValue;
    System.out.println("C3 =" + c3); // downgrade must need to write(), but upgrade no need , coz no risk

    char c4 = 'わ';
    int i5 = c4;
    System.out.println("i5=" + i5); // i5=20320

    char character = 'a' + 1;
    System.out.println(character); // b

    char zero = '0';
    int asciiCode = zero;
    System.out.println(asciiCode);

    int sym = 228;
    System.out.println((char) sym);

    short a = (byte) 128; // int > byte > short (downcasting)

    int x2 = 128;
    short x3 = 128;// if u know 128 cannot be byte before

    int i = Integer.MAX_VALUE;
    int j = i + 1;

    int k = 20;
    byte f = (byte)k; //downcasting
    System.out.println(f); 

    byte value = 127;

    for (int o = 0; o < 10; o++){
      value++;
      System.out.println("value" + value); // byte -128 > 127 , so loop 10 times. like cycle
    }
  }
}
