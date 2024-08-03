public class demolf {
  public static void main(String[] args) {

    // Conditional : if

    int x = 4;
    if (x >= 3) {
      System.out.println("x>=3");
    } // code block
    int y = 2;
    if (y >= 3) { // code block
      System.out.println("y>=3");
    } else {
      System.out.println("y<3"); // print
    }
    int a = 10;
    int b = 7;
    // print max = 10; " check the result"
    if (a > b) {
      System.out.println("max =" + a);
    } else {
      System.out.println("max =" + b);
    }
    int x1 = 3;
    int y2 = x1 * 3;
    if (x1 + y2 >= 10) {
      System.out.println("more or equal to 10");
    } else {
      System.out.println("<=10");
    }

    String ans = x1 >=30 ? "Correct" : "Wrong" ;
    System.out.println(ans);

    int a1 = 80;

    if(a1>=100) {
      System.out.println("Well-done");
    } else if (a1>=80) {
      System.out.println("Great");
    } else if (a1 >=60){ 
      System.out.println("Pass");
    } else if (a1<=50){
      System.out.println("Flight");
    }
  }



  }

