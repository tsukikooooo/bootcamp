import java.util.Scanner;

public class DemoSwitch {
  public static void main(String[] args) {
// Switch  
    char grade ='B'; // check Systax first
    switch (grade) {
      case 'A' :
        System.out.println("The grade is " + grade);
        break; // break the switch statement 用左, 不同跟次序
      case 'B':
        System.out.println("The grade is " + grade);
        break;
      default: // do not match alow rules
        System.out.println("No grade");  
        break;
      }
/// if dont use "break", 


      if (grade == 'A' || grade =='B' || grade =='C'){
        System.out.println("The grade is" + grade);
      } else {
        System.out.println("No grade");

      }
      // if u dont use break statement, the ordering of the cases may cause various result. 位置重要性
      int x = 0;
      switch (grade) {
        case 'A' :
          x +=10;
        case 'B':
         x +=10;
        case 'c':
         x+=10;
       default:
         x+=10;
        }
        System.out.println("X=" + x);
        ///SWITCH 可以有AND 意思嗎? 
      
    //scanner 
      Scanner input = new Scanner(System.in);
      System.out.print("Please input a number: "); 
      int month = input.nextInt(); //Line of input > int
      System.out.println("month=" + month);
      
  }
}
