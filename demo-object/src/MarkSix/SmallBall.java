package MarkSix;

import java.util.Objects;

public class SmallBall extends Ball{
  private String colour;

  public SmallBall(String colour, int number){
   super(number);
   this.colour = colour;
  }
  //constructor

  //toString
  public String toString(){
    return "Colour" + this.colour + "Number:" + super.toString();
  }
  
  public String getColour(){
    return this.colour;
  }

  //equals()
  @Override
  public boolean equals(Object obj){
    if(this == obj)
     return true;
    if(!(obj instanceof SmallBall))
     return false;
     SmallBall smallBall = (SmallBall)obj;
     return Objects.equals(this.colour, smallBall.getColour()) && Objects.equals(this.getNumber(), smallBall.getNumber())
  } //logically super : Ball ,, but use this is more balance.  this.get < coz call ball
    
    @Override
    public int hashCode() {
      return Objects.hash(this.colour, super.getNumber());  // 用super/ this都OK 因為無比較, 唔同上面equals.
    
    }

    public static void main(String[] args) {
      SmallBall b1 = new SmallBall("Red", 1);
      SmallBall b2 = new SmallBall("White", 2);
      SmallBall b3 =  new SmallBall("White", 2);
      System.err.println(b2.equals(b3));
      System.out.println(b1.hashCode());
      System.out.println(b2.hashCode());

      //call toString()
      System.out.println(b1);
    }

}

  
  //toString()? equals()? hashcode?


  
