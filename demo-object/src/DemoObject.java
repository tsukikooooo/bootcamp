import java.util.Scanner;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthStyleFactory;

public class DemoObject {
  public static void main(String[] args) {
    //getClass()
    StringBuilder sb = new StringBuilder(); //java.lang.StringBuilder

    Scanner scanner = new Scanner(System.in);//java.util.Scanner
   //Object class is file, new object of object clas

    Object object = new Object(); //(java.lang) Object 萬能指針,super parent
    object = "abc";
    object = Double.valueOf(13);
    object = new Cat();
    Object ob1 = new Object();
  
  //All Classes extends Object.class Inherit all methods from Object.calss
    System.out.println(new Cat().toString()); //I am a cat
    System.out.println(new Dog().toString()); //Dog@4554617c
    
    Cat c1 = new Cat();
    System.out.println(c1.hashCode()); //generate an int value by oject reference > 1023892928

    Cat c2 = new Cat();
    System.out.println(c2.hashCode()); //558638686

    String x1 = new String("abc"); // string same
    System.out.println(x1.hashCode()); //96354 
    String x2 = new String("abc");
    System.out.println(x2.hashCode());//96354 
    

    Object cat = new Cat();
    //cat(object reference) indeed pointing to cat object.
    //run() instance method can only be called by object declared by Cat.class
    //if the object reference is declared by Object.class, it cannot call run() method
    //cat.run();  //cannot call run.  (Compile Error)

    //downcast
    Cat cat3 = (Cat) cat; // Reason why compile error: Java compiler cannot guarette.  
  // ***** //Object cat = new Dog() >> 唔會分析, 只CHECK 關係(打個個自己負責) L42, L34 績几睇
    //Complie time only check 個類型, 兩邊對等, 如Cat cat = cat 咁先會錯,但Object cat= (Cat) cat/(D) 
    //Object cat = new Dog();
    //Cat cat = (Cat) cat;

    Cat cat2 = (Cat)cat; 
    cat2.run();  //only cat2 can call

    //Cat.class inherit Object.class
    cat2.hashCode(); 
    cat2.equals(cat); //why? coz inhel
     //來自Object Class

    //the difference between cat and cat2 object reference.
   }
    //Java: Ensure Type Safty durng compile time. 
  // public static Object sum(Object x, Object y){  
  //   return x + y; // "+" operations > String, Integer, int, Double, double, etc...
    
  // }
  public static int length(String x){
    return x.length();
  }
....//test dont override *, check hash code 
  



  //During compile time, Compiler cannot ensure the object in heap is a String object
  // public static int length2(Object x){
  //   return x.length2();
  // }
}
