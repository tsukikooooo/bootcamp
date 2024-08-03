import java.util.Arrays;

public class DemoWhileLoop {
  public static void main(String[] args) {
    
    for (int i = 0; i < 5 ; i++){
      System.out.println(i);
    }
    int i = 0;
    while(i< 5){  //one statement
      System.out.println(i);
      i++;
    }

    int[] arr = new int[] {10,-100,9,7};
    // sum all nums by while loop
    int sum = 0;
    i = 0;  // i is whole block, i = 5, so need to reset i = 0 to cal this
    while (i <arr.length){
     sum += arr[i];
     i++;
    }
     System.out.println(sum);

     //while can use break
     i =0;
     while (i<100){
      if (i >30){
        break;
      }
      i++;
     }
     System.out.println(i); // 

     //123 >> 1 + 2 +3
     //100>> 1 + 0 + 0 
     //4563 >> 4+5+6+3 >>18

     int a = 123;
     sum = 0;

     
     while(a>0){
      sum += a %10;
      // 123 >>12
      a = a/10;
        
       }
       System.out.println(sum);
      
       // reverse number
       // 54321 >> 12345 
       //101-> 101 

       int[] s = new int[]{55,44,33,22,11};
       int left = 0;
       int right = s.length -1;

       while (left< right){
        //swap cha at left and right pointers
        int temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        //Move the point inward
        left++;
        right--;
       }
       System.out.println(Arrays.toString(s));
     }
  }

  
