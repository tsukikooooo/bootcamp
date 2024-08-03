public class DemoLiteraPool {
  public static void main(String[] args) {
    //Litera Pool (String)
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2); //true

    String s3 = "hello";
    String s4 = new String("hello"); ///<< "new" :create new object
    System.out.println(s3 == s4); //false
    System.out.println(s3 == s1 && s3 == s2); //true

    s3 = s4;
    System.out.println(s3 == s4); //true.... they are pointing to the same object
    

  // if you equals() , means 4 are same, coz is using check value

//****************** */
  String s5 = "he";
  String s6 = "llo";
  s5 = s5 + s6; //hello(new String)
  System.out.println("s1=" +s1); //hello  
  System.out.println(System.identityHashCode(s1)); //1247233941
  System.out.println(System.identityHashCode(s5)); //258952499
  System.out.println("s5=" + s5); //hello  "+" new String Mechamium...so 當create new object..!!  is the different 
  System.out.println(s5 == s1); //false 

  //Immuntabiliy
  //String is immuntability
  //other valueable can change
  // + will create new object 

  String s7 = "hello";
  System.out.println(System.identityHashCode(s7)); //1247233941
  s7+= "world";  // but cannot build hello world as one String, its is different.
  System.out.println(System.identityHashCode(s7)); //603742814  ..new object
  //use hash code to confirm object is same or not.

  String s8 ="hello";
  System.out.println(System.identityHashCode(s8));  //1247233941
  s8 = s8.replace("e", "a");  //new
  System.out.println(System.identityHashCode(s8));  //1325547227


  String s9 = "hello";
  System.out.println(System.identityHashCode(s9)); //1247233941
  s9 = s9.toUpperCase();
  System.out.println(System.identityHashCode(s9)); //980546781
//same idea apply most of the String methods.
//concat() , substring(), upper case


  String s10 = "hello";
  System.out.println(System.identityHashCode(s10)); //1247233941
  System.out.println(System.identityHashCode(s10.concat("world"))); //2061475679


  ///****substring if same "hello", the hash code is same as s10, as the first "hello", same object.
  System.out.println(System.identityHashCode(s10.substring(0,5))); //1247233941
  System.out.println(s10.substring(0,5)); //hello   

  

  











  }
}