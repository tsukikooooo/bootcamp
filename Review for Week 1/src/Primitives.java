public class Primitives {
  public static void main(String[] args) {

    //boolean, byte, char, short, double, int, long, float 
    byte XX = -127; //-128 - 127 8bits
    double x = 20.000000000000000000000000000000000000000000000000000000; //64bits
    float x1 = 0.000000000000000000000000000000000000000000001f;//32bits
    int  y = 290000000;      //32bits
    long z= 123414555555555699L;        //64bits
    short r = 12330; //16bits 
    char k ='A'; // 16bits ' ', '@'         XX ''

    boolean isRaining = true;
    System.out.println("Is it raining, today? " +isRaining);

    String str = "Hello";
    int length = str.length( );
    System.out.println(length);

    String str1 ="Hello";
    String str2 ="Hello";
    String str3 = "WOrld";

    boolean isequals1 = str1.equals(str2);
    boolean isequals2 = str2.equals(str3);

    String str4 = "Worl*d";
    char ch = str4.charAt(0);
    char ch2 = str4.charAt(4);
    System.out.println(ch + " " + ch2);


    
     
  }
  
}
