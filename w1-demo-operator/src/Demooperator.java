public class Demooperator {
  public static void main(String[] args) {
    int x = 3;
    Integer x1 = 3;
    double x2 = Math.PI;
    System.out.println(x2); //

    x = x + 1;// x=4,
    System.out.println("x=" + x); // String + int >> string
    x++; // same as x=x+1
    System.out.println("x=" + x);
    x += 1; // same as x=x+1
    System.out.println("x=" + x);

    x += 2; // same as x =x+2;
    System.out.println("x=" + x);

    ++x; // same
    System.err.println("x =" + x);

    int y = 3;
    y = y - 1; // 3-1
    y--; // 2-1
    --y; // 1-1
    y -= 1; // 0 -1
    System.out.println("y = " + y);

    int z = 4;
    z--;
    --z;
    int zb = --z * 10;
    System.out.println(zb);
    int ze = z-- * 10;
    System.out.println(ze);

    // *=
    int p1 = 4;
    p1 = p1 * 2; // 8
    p1 *= 2; // 16
    p1 /= 4; // p1=p1/4
    System.out.println("p=" + p1); // 4

    int zz = 10;
    zz = zz % 3; // 1
    int j = 10;
    j %= 3; // 1
    System.out.println("z=" + z + "j=" + j);

    String s = "hello";
    s = s + "world"; //
    s += "!!!!";
    System.err.println("s=" + s);

    // ** XX NO %%

    // > , < , >=, <=
    boolean r1 = 10 > 3; // T
    boolean r2 = 4 > 10; // F
    boolean r3 = 10 >= 10; // T
    boolean r4 = -9 <= 9; // 
    System.out.println(r1);


    // and(&&) or (||)
    boolean r5 = 10 > 3 && 20 >= 20; // T + T = T
    boolean r6 = 10 > 3 && 4 < 4; // T + F = F
    boolean r7 = 10 > 3 || 20 >= 20; // T /T = T
    boolean r8 = 10 > 3 || 20 < 18; // T /F =T
    boolean r9 = 3 > 10 || 20 < 18; // F / F =F

    char c10 ='A';
    char c11 ='B';
    boolean r10 = c10 == c11; //asking if a value = value , use "==" 比較式
    // = is assign, == confirm True or False
    boolean r11 = 'C' != '0'; // T, checking not equals to another value
    System.out.println(r10); //F
    System.out.println(r11); //T

    boolean r12 = 10/2 > 5*3; //F  caluclate  can be use inside.
    
    ////
    int n =3;
    int result = n++ *3; // original n multiply 3 first, assign 9 to the result, the n = n+1;
    System.out.println(result); //9 
    System.out.println(n); //4 , n++ mean n+1 only

    int m =4;
    int result2 = ++m *5; // m=m+1 first, multiply 5, assign 25 to result2
    System.out.println(result2); //(1+4)*5
    System.out.println(m); //5

    int k=4;
    int result3 =k++ * 7 * ++k; //168 =(4*7)*6   
    System.out.println(result3);
  }
}
