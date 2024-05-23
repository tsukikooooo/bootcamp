public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    int first = 1;
    int second = 1;
    System.out.println(first);
    System.out.println(second);

    for (int i = 0; i < 13; i++){
      int sum = first + second; // 1 + 2 =3
      first = second; // first:1 >>> 2  ** new assign 
      second = sum; // second: 2 >>>.3  ..
                      // sum = 2 +3 >> 5 
                      // first : 3 
                      //second : 5 
                      // = 3+5 = 8 
      System.out.println(sum);
    }
 }
}