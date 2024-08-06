import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayException {
  public static void main(String[] args) {
    int[] arr = new int[5] ;
    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 1;
    arr[3] = 4;
    arr[4] = 5;
    //arr[5] = 1; // java.lang.ArrayIndexOutOfBoundsException

    int idx = 0;
    if(idx >=0 && idx < arr.length){
      arr[idx] = 10; //programelicaly, exception
    }

    try{
      arr[5]=1;

    }catch (ArrayIndexOutOfBoundsException e){ //
      //send e-mail to someone.
    }
    System.out.println("end of program.");


    //chatAt 
    String str = "hello";
    str.charAt(1); //e
//  str.charAt(str.length()); // java.lang.ArrayIndexOutOfBoundsException
 str.substring(0, str.length()); // java.lang.StringIndexOutOfBoundsException
    //substring
    str.substring(0, 6);// java.lang.ArrayIndexOutOfBoundsException
    str.substring(0, str.length()); // java.lang.StringIndexOutOfBoundsException

    //除function 外, 還要小心 放變量時
    int result = Integer.parseInt("1");//1
    System.out.println(result);
    
    int result2;

    try{   //被動throw
      result2 = Integer.parseInt("hello"); //java.lang.NumberFormatException 
    }catch (NumberFormatException e){
      result2 = -1;
      System.out.println("NumberoFormatExceotion! Message: " + e.getMessage()); // For input string: "hello"
    }
    
     System.out.println(result2); //-1

    System.out.println(getDescription(18)); //Adult
    int age = -1;
    try{ //throw object, throw the class?
      getDescription(age);

    }catch(IllegalArgumentException e){ //自帶print error msg
      System.out.println(e.getMessage());

    }
    List<String> strings = new ArrayList<>(); // arr[0] // arr[0], 有index 小心爆炸
    // strings.get(0); // java.lang.IndexOutOfBoundsException

    List<String> strings2 = new LinkedList<>();
    // strings2.get(0); // java.lang.IndexOutOfBoundsException //底層array, array List,  


  }
  public static String getDescription (int age){
    if (age < 0)  //主動throw
      throw new IllegalArgumentException("age should not be negative!"); //invalid parameter  : constructor,, throw IAE 
    if (age >= 66)
      return "Elderly"; //最頂條件最窄, 咁先知自己有bug  check 得到
    if (age >= 18)
      return "Adult";
    return "Children";


  
  }
  
  }
  

