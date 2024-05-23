public class DemoString {
  public static void main(String[] args){
    //Sting stores text
    String x = "hello";
    String y = "@#@$&)@";
    String dollar = "$10";
    
    String WithSpace ="....tets...e!";
    System.out.println(WithSpace);

    // + only + if string co
    String z = x + dollar;
    System.out.println(z); //hello$10

    //remindar 
   int remaindar = 10 % 3; //餘數 整數GE 餘數係1!!!!
   int divide = 10 / 3; //3
   System.out.println(remaindar); //1
   System.out.println(divide); //3

   //-------------------------------------------------------
   //week 2 String continute
   double price =9.99;
   String item="Book";
   String description = "The" + item+ "cost $" + price; // String + String + double
   System.out.println(description);

   char a ='A'; 
   String message = "The answer is:" + a; // char ---> String
   System.out.println(message);

    //String Method (Tool)  1: Length()
    String q = "hello";
    System.out.println("The length of t=" + q.length()); // belows to String t.length >> int

    ///check is length >=4, is yes print hello, else "Goodbye"
    if (q.length() >=4){
      System.out.println("Hello");
      
    } else {
      System.out.println("Goodbye");
    }


    // Method 2: equals
     String s1 = "Hello"; /// == not equal
     String s2 = "Hello";
     if (s1.equals(s2)){
      System.out.println("They are having same String vlaue.");
     }else {
      System.out.println("They are not same value");
     }
     // not equals !! means NOT!!!!
     if (!s1.equals(s2)){
      System.out.println("They are having same String vlaue."); 
    } else{
      System.out.println("They are not same String vlaue.");
    }


     if (s1 ==s2) {
      System.out.println("They are same object."); //print 
     }
     // check is s1 length >=6 or s1 equals s2, print
     if (s1.length()>=6 ||s1.equals(s2)){
      System.out.println("Yes S1 >= 6");
     }
     
     if (s1.length()>=6) {
      //have diffent choose. 
     }else if (s1.equals(s2)) { //not seritfy 
      System.out.println("hello");
     }
    if (s1.length()>=6 && s1.equals(s2)){ //if + if slow<< use && ||
      System.out.println("Yes S1 >= 6"); //F && T >> F
     }

     
     //Method 3: chatAt(int index), for example, chatAt(0)
     // 0 1 2 3 4 , 0 as first 
     String s3 = "World";
     System.out.println("The 1 st character of s3 =" + s3.charAt(0));//W
     System.out.println("The 3rd character of s3 =" + s3.charAt(4));//d
     ////*** */
     System.out.println("The last char of f3: " + s3.charAt(s3.length()-1)); //d, 解入面, 再解出面
   
   //check if the last character is d and length >5, is yes , print yes
     String x2 = "hello world";
     //if (x2.charAt(x2.length()-1)=='d' && x2.length()>5) { //char use == ''
     // System.out.println("Yes");
   //  }

   // Method 4: substring (int beginIndex, int endIndex)
  
   String result = x2.substring(0,5); //(5-1 index)
    System.out.println(result) ; //he  
    System.out.println(x2.substring(0,5));  // "hello"
    System.out.println(x2.substring(0, 0)); // ""

    //check if the first three character is "wel", if yes, print yes
    String x3 = "welcome";
    System.out.println(x3.substring(0,3));
    if (x3.substring(0,3).equals("wel")) { // string must use equals
      System.err.println("Yes" + x3.substring(0,3));
    }
    System.out.println(x3.substring(0,3).length()); //3
    System.out.println(x3.substring(0,3).charAt(1));//e

    {
      System.out.println("Yes" + x3.substring(0,3));

      // *** 
      String x6 = x3.substring(0,3); //"wel"
      System.out.println(x6.length()); //3 

      //slow method
      String x4 =x3.substring(0,3);
      int l1 =x4.length();
      System.out.println(l1); //3 
    }

    ///charAt
    if (x3.charAt(0)=='w' && x3.charAt(1)=='e'&& x3.charAt(2)=='l'){
      System.out.println("Yes");
    }
//w3 
    // isEmpty() >> check length
    // Empty String value > ""
    String x7="";
    System.out.println(x7.isEmpty()); // return T or F
    String x8="abc";
    System.out.println(x8.isEmpty()); 
    
    // isBlank()  >> check right space then length
    String x9 ="";
    System.out.println(x9.isBlank());//T
    x9 = " ";
    System.out.println(x9.isEmpty()); //F

    //substring(0,3)
    //substring(0)
    String s10 = "hello";
    System.out.println(s10.substring(0)); // hello , From index 0 to the end. 
    System.out.println(s10.substring(0,3)); //hel From index(0) - to index (2) 3-1

    //hello >> HELLO toUPPerCase // toLowerCase
    System.out.println(s10.toUpperCase()); //"HELLO"
    String s11 = "HELLO";
    System.out.println(s11.toLowerCase()); // "hello"

    // replace
    System.out.println(s10.replace('l', 'x')); // hexxo
    System.out.println(s10.replace("ll", "yyyy")); // can replace sting , no any limit of length
    System.out.println(s10.replace("lll", "abc"));

    //contains
    System.out.println(s10.contains("ok"));  // False

    //startsWith() check prefix
    System.out.println(s10.startsWith("he")); // True

    //endsWith()
    System.out.println(s10.endsWith("o")); //True

    //trim()  removing the space characters at the head / tail of the String (keep mid, cut space of start and end)
    String s12 = "    Hello,     Boot camp..!!!...";
    System.out.println(s12.trim());

    String[] strings = new String[] {"hello", "abcijk", "vincent", "Hello","   HELLO  "};
    // how many strings contains "ELL", but ignore case 
    //"eLL" or "ell" or "ELl"
    
    System.out.println(String.toUpperCase[i]);

  }

}




