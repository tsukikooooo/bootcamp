public class DemoPrimitives {

  public static void main(String[] args) {
    // 8 type
    // Primitives = basic to install the value.
    // number/string(text)
    // when create new project need to restart
    // number(integers/decimal)
    // int = 3.5 XXXXX, y cannot store non-integer number.
    // 3 put it in x (let x = 3)
    // int is a data type that declaring the type of the value of x can be stored.

    int x = 3;
    int z = -9;
    int total = x + z; // -6
    System.out.println(total);

    int a = 2;
    int b = 0;
    int wa = b / a;
    System.out.println(wa);

    int e = total - z;
    System.out.println(a);

    int k = a + x * 8;
    System.out.println(k);
    int r = 32 / x;
    System.out.println(r);

    // 2024.05.10
    double s1 = 10.3;
    double s2 = 10.34567; // variable need to small letter , cannot use number at 1st.
    double s3 = -110.999;

    double result2 = s1 + s2 - s3;
    System.out.println(result2); // double > +,-,*,/ will have issue in some scenario

    double result3 = 0.1 + 0.2;
    System.out.println(result3); // 0.300000000000004

    double result4 = 2 + 4 * 0.25 * 3 / 2 - 10;
    System.out.println(result4); // 2+(4*0.25*3/2)-10> -6.5

    int f1 = 7;
    double f2 = 8.8; // if add tgt got error. 
    //int f3 = f1 + f2; // error, bez int + double  > double (7.0) + double(8.8),
    // so double value can be stored in an int variable.
    // can not put it in int
    // int g = 10/3; int/int >> int >>3, so 3 can be assigned to variable g
    // type is import , cannot down grade (like int down to double) XX cannot be

    //try 8 type: like bool...

    //Primitive : char            save only 1 chars  XX char c4 = 'aa'
    char c1 = '!'; // ** single quote **
    char c2 = ' '; //space value  ( 1 character)
   // char c3 = ''; // error char variable must contain a single character.
   // char can ++ 
   //

    // Primitive Boolean > True / False 
    //boolean b1 = "True"; cannot assign a string value to bool
    boolean b2 = true;
    boolean b3 = false;
    // bool b4 = 1 XX  cannot not assign number to bool.

    // Primitive for Integer
    // int, long, byte, short
    //almost int use in all the time, but ..
    byte y1 =1;
    //byte can only store the integer with range of the value between -128 to 127 2^8
    byte y2 = -128;
    byte y3 = 127;
   // byte y4 = 128 // compile error (java can identify the syntax(Gramma) error)

    short s1 = -32768; //(2^n)  -32768 to -32767
    int i1 =-2147483648; // -2147483648 to 2147483647
    long l1 = -9223372036854775808L; //-9223372036854775808 defalu as int. can't be long, need add "L"
    // need to -9223372036854775808L
    long l2 = -9223372036854775808L;// L means a way to specift this value is a long value

    // Primitive for number with decimal 
    // 10.2 is double value
    // you can't assign a double value to float variable, buz float is with low level of data type.
    // in con , cant a higher leve of data value to a lower level data type
    double d10=10.2;
    // 10.2f is a float vlaue
    float f10 =10.2f;

   // float f11 = 10.5f + 10.5;// float + double change to double, not OK on it "ERROR"
    double d11 = 99.99d; //same as double d12 = 99.99; default is double no need to write d after number.

    // Local Variable {} = (with in the prog. can only declare the same variable ONCE)
    double d12; // variable declaration 左手邊聲明
    d12 = 10.9; //value assigment
    double d13 = 14.3; // declaration and assignment
    //varibale cna re assigment
    d13 = 19.0;//reassigment 
    //double d13 = 19.0; XX cannot re-declare same variable
  }
}
