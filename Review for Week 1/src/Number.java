public class Number {
  public static void main(String[] args) {
    int x = 100 / 2;
    int m = 10;
    int y = m * 3;

    int a = x * 3; // 150
    int b = y; // 30
    System.out.println("a=" + a + " " + "b=" + b); // string"a=" "b=", space = "

    double z = 2.3;
    double bb = z * 30;
    double MPF = bb * 0.95;
    System.out.println(MPF);

    float tsur = 20.25566888f; // tsur = 20.255669 doajor jun 1
    System.out.println(tsur);


    char C = 'a'; // char got error on it not same as int.
    System.out.println(C);

    int f = 10 % 2;
    System.out.println(f); // f=0

    int fd = 10 / 2; // fd=5
    System.out.println(fd);


    // Operators + - * / % ++ -- += == *= /= %= -=
    int k = 10;
    ++k;
    k++;
    System.out.println(k);

    int h = 3 * --k - 4;
    System.out.println(h);

    int h1 = 3 * k-- - 4;
    System.out.println(h1);

    int f1 = 10;
    f1 += 3;
    System.out.println(f1);

    int f2 = 100;
    f2 /= 25;
    System.out.println(f2);

    int f3 = 200000000;
    f3 *= 2;
    System.out.println(f3);

    int f4 = 900000000;
    f4 %= 100000;
    System.out.println(f4);


    // Operators && || !
    boolean isRaining = true;
    boolean isSunny = false;
    boolean iscloudy = true;

    boolean result = isRaining || isSunny; // T
    boolean result2 = isRaining && isSunny; // F
    boolean result3 = !iscloudy;

    System.out.println(result);
    System.out.println(result2);
    System.err.println(result3);

    // conditional operators + if else
    int d = 10;
    int d1 = d * 5;
    // Method 1
    if (d1 * 5 >= 60) {
      System.out.println("d over 60, the value is " + d1);
    } else {
      System.out.println("d under 60, the value is " + d1); // d over 50
    
    // Method 2
    String result4 = d1 * 5 >= 60 ? "d over 60, the value is " + d1 : "d under 60, the value is " + d1;
    System.out.println(result4);

      int x1 = 3;
      int y2 = x1 * 3;
      if (x1 + y2 >= 10) {
        System.out.println("more or equal to 10");
      } else {
        System.out.println("<=10");
      }
      String ans = x1 >=30 ? "Correct" : "Wrong" ;
      System.out.println(ans);

      
      
    }
  }
}

