import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import javax.management.monitor.Monitor;

//// this file got error with unknow msg
public class test {
  public static void main(String[] args) {
    int a = 123;
    double b = 123.45;
    boolean z = false; // boolean z = pizza (XXX)
    char symbol = '@'; // ' ','A' XX''
    String name = "Bro@";

    System.out.println("Hello " + name);

    // SWAP to variable
    String x = "water";
    String y = "Kool-Aid";
    String temp;

    temp = x; // temp = water
    x = y; // x = Kool-Aid
    y = temp; // y = water

    System.out.println("x:" + x);
    System.out.println("y:" + y);

    // Scanner
    // Scanner scanner = new Scanner(System.in); // if hv scanner must run , otherwise //

    // System.out.println("What is your name?");
    // String name2 = scanner.nextLine(); // nextLine()

    // System.out.println("How old are you?");
    // int age = scanner.nextInt(); //nextInt()

    // scanner.nextLine(); // have 2 string, need to add?

    // System.out.println("What is you favourite food?");
    // String food = scanner.nextLine();



    // System.out.println("Hello " + name2);
    // System.out.println("You are " + age +" years old.");
    // System.out.println("You like " +food);



    // expression = operands & operators
    // operands = values, variables, numbers, quantity
    // operators = + - * / %
    int friends = 10;

    // friends =(double) friends / 3; //cannot store double
    friends++;

    System.out.println(friends);

    Scanner input = new Scanner(System.in);
    System.out.print("Please input a number: ");
    // int month = input.nextInt(); // Line of input > int
    // System.out.println("month=" + month);

    int[] forEachtest = new int[] {124, 56, 23, 86, 45};
    for (int fornew : forEachtest) {
      System.out.print(fornew + " ");
    }
    System.out.println(Arrays.toString(forEachtest));
  }
  

}

