public class demoMethod {
    public static void main(String[] args) {
       

    //Method; you put something into the box, and then return sth to u
    //calling method
    System.out.println("Hello");


    // Call method(sum)
    int result = sum(10,3);  //} so, need to add
    System.out.println("result =" + result); //13

    System.out.println(lastChar("hello")); // o

    char[] arr = new char[] {'a','b','c'};
    System.out.println(toString(new char[] {'a', 'b','c'}));

    
    //System.out.println(new int[]);

    System.out.println(isSubstring("hello", "ll")); //true
    //System.out.println("hello","lls"); //F 

    System.out.println(circleArea(3));

    // double*double(problem)
    //BigDecimal (solution)
    }
//------------------- like sand box--------------------------------------
    // can change data type , design the box...
    public static int sum(int x, int y) {
        // if your method is with return type, the method content should cotain a key work"return"
        return x + y; // return 10 also OK !!! remember the return type is same type. int+ int >> int
    }

    public static char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    // Approach 1;
    public static String toString(char[] arr) {
        // String result = "";
        // for(int i = 0; i<arr.length;i++){
        // result += arr[i];
        // }
        // return result;


        // Approach 2;
        return String.valueOf(arr);
    }

  public static int max(int[] arr){
   int maxv = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length;i++){
        if (arr[i] > maxv){
            maxv = arr[i];
        }
    }
         return maxv;
        
      }
  public static boolean isElderly(int age){
    //> 65

//Approach 1
    //if (Elderly > 65){
    

    //return true;
    
    // Approach 2;
    return age > 65;
}

    public static boolean isSubstring(String str, String substr) {
        //check is substr is a substring of str.

    //Approach 1
     //return str.contains.(subStr);
        //}
     //Approach 2
     // indexOf() method returns an int index, which is index position substring
   //  return str.indexOf(substr)!= -1;  // not = -1 mean not exists.

     //for loop
     //approach 3
     for (int i = 0; i< str.length(); i++){
        for (int j = 0; j<substr.length(); j++){
            if(str.charAt(i + j)!=substr.charAt(j)){
                break;
              }if (j == str.length()-1){
               
              return true;
              }
            }
     }
        return false;
    }


    //HW  Le
    //Java ))PI
    public static double circleArea(int radius){
        return radius*radius *Math.PI;  // int * int * double >> double(2*2*2.0) = double 有大拎大 ** double * doulbe 會有精度問題
    
    
     
    }
  
}
