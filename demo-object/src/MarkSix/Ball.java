package MarkSix;

import java.util.Arrays;

public class Ball {
  private int number;

public int getNumber(){
  return this.number;
}

  @Override
  public String toString(){
    return  "Number:" + this.number;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj) //obj == input prelomita
      return true;
    if(!(obj instanceof Ball)) // instanceof like getClass?
      return false;
    Ball ball = (Ball) obj;
    return Object.equals(this.number, ball.getNumber());
  }
  public static void main(String[] args) {
    byte b1 = 48; //kava specia convesion: int byte, , but without casing in downcast
    int i1 = 48;
    byte b2 = (byte)i1; // he 3type of its is is int so we need hare to expicity
    
    int [] arr = new int[3];
    System.out.println(Arrays.toString(arr));
    int[] arr2 = new int[3];
    System.out.println(Arrays.toString(arr2));
    System.out.println(arr.equals(arr2));//false ** equals checking value本身, 好容易會搞錯
    System.out.println(Arrays.equals(arr,arr2)); //true

   // Ball b = new Ball(48);
    Object ball = new Ball(48); // 指針類至至
    //ball.getNumber(); //polymorhism ..why? check that ch 17?
    System.out.println(ball.getClass()); //Class marksix.Ball

    Class<?> clazz = ball.getClass(); //接住BALL 
    System.out.println(clazz); //class marksix.Ball
    System.out.println(ball instanceof Ball);//true >>?? Ball??ball OBJ?^^
    //diff. with instanceof > 直接問係T /F 

  }
  
}