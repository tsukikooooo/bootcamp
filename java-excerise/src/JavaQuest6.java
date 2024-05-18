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
    for ( int i = 0; i < 13; i++) { // 15 - first -second
      int sum = first + second; 
      first = second;           
      second = sum;             

    System.out.println(sum);
      }
 }
}