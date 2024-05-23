import java.util.Scanner;

public class LoopEx {
  public static void main(String[] args) {
   //Exercise 1:
// Write a program that prints the numbers from 1 to 10 using a for loop.
    for(int i = 0 ; i < 11 ; i++){
      if (i > 0){
      System.out.println(i);}
    }
//Exercise 1:
//Write a program that prints the numbers from 10 to 1 in descending order using a for loop.

    for(int i = 10; i > 0; i--){
      System.out.println(i);
    }

//Exercise 2:
//Write a program that calculates and prints the sum of all even numbers from 1 to 20 using a for loop.
    int sum = 0;
    for (int i = 0; i < 21;i++){
      if (i % 2 ==0){
        sum += i;
      }
    }
    System.out.println(sum);

//Exercise 3:
//Write a program that prompts the user to enter a positive integer and prints a triangle pattern of asterisks (*) with that many rows using a for loop.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input the integer: ");
    int abc = scanner.nextInt();
    scanner.nextLine();

    
    for (int i = 0; i < abc; i++){
      for (int j = 0; j < abc; j++)
      System.out.println(abc);
    }
      

//Exercise 4:
//Write a program that calculates and prints the factorial of a given number using a for loop. The factorial of a number is the product of all positive integers less than or equal to that number.



//Exercise 5:
//Write a program that prompts the user to enter a number and prints the Fibonacci series up to that number using a for loop.
  }
}
