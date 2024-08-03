public class Quiz3 {
  interface Vegetarian{
    default public String eat(){
      return "[Vegetarain] I am XX";
    }
  } 
  interface Runner {
    default public String eat() {
      return "[Runner] I am able to eat";

    }
  class Pig extends Animal {
    public String eat() {
      return "[Pig] I am able to eat";
    }
  }

  class Animal {
    public String eat() {
      return "[Animal] I am able to eat";
    }
  }
    public class SmallPig extends Pig implements Vegetarian, Runner{
      public static void main(String[] args) {
        SmallPig smallPig = new SmallPig();
        System.out.println(smallPig.eat());
      }
    }
  
  
