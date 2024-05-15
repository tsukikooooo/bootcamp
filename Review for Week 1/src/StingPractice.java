public class StingPractice {
  public static void main(String[] args) {
    System.out.println("Hello!!!! I Love YuN");

    String x = "LOVE";
    String y = "Yun";
    String a = "Moon";
    String b = a + x + y;
    System.out.println(b);

    char k = 'C';
    System.out.println(k);
  
  // length         .length()
    String x1 = "Good Morning";
    System.out.println("Test:" + x1.length());

    if (x1.length()>=13) {
      System.out.println("length largest than 13");
    } else {
      System.out.println("less than 13, correct length is: " + x1.length());
    }
  //equals      compare string (x1.equal(x2))  ||   (!x1.equal(x2))
    String x2 ="Welcome back";
    
  if (x1.equals(x2)) {
    System.out.println("Same");
  } else {
    System.out.println("x2 is not same");
  }
   if (!x1.equals(x2)){
    System.out.println("Yes, is not same");
   } else {
    System.out.println("is same");
   }
// check if the first three character is "wel", if yes, print yes
    if (x2.substring(0,3).equals("wel")){
      System.out.println("Same");
    }
  // charAt x1.chatAt()  count start from 0 
   System.out.println("The 1st letter is :" + x1.charAt(0) );
    
  //substring //print the range 
  System.out.println(x1.substring(1,6));

  // exercise 
  String S1 ="hello";
  String S2 = "Welcome";
   // check if s1 length >= 6 and s1 equals s2, print ...
    // AND
  
      // check if the last character is d and length > 5, if yes, print yes.
  }
}
