public interface Walkable{
  //Interface  (like e-contract)
  //1. no instance variable
  //2. all methods are "publiv abstract" implicitly
  //3. u can still declare "public static final" implicitly
  //4. A class can implements more than 1 interface, but it can only extend one Parents class only.

  
  //public 4ever

  //public static final int AGE = 3; (backend ver)
  //constant variable name;
  int AGE = 3;

  //abstract void walk();
  void walk();

  //void run();

  // After java 8, we hav
//can be overriden
  default void run(){
    System.out.println("default I am running..");
  }
  static void swim(){
    System.out.println("Static I am swinning");
  }

}