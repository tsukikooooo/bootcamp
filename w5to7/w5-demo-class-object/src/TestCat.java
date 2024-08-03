public class TestCat {

  public static void main(String[] args) {   //透過MAIN 生產工具?

    //Local variable
    String name = "John";
    //Local varibale
    Cat c1 = new Cat();        //"new Cat()" -> produce Cat Object in memory (new Class)
    // memory address--0xhihin2324u0
    // c1 --> object reference/ variable, able to find the cat object  佢可以追蹤地址搵佢 C1 依個
    c1.setAge(10); 
    c1.setName("Test");

    System.out.println(c1.getAge()); //10
    System.out.println(c1.getAge());
 
 
  

  //  //how to call describle()
  //  //instance method is able to access (read & write) the obejct attributes
  //  Cat cat = new Cat();
  //  cat.setAge(13);
  //  cat.setName("Abc");
  //  system.out.println(cat.describe()); //The age of this cat is 13, and name of this cat is ABC
   

   Cat c2 = new Cat();
   c2.setAge(7);

   System.out.println(c2.getAge()); //7 
   System.out.println(c1.getAge());  //10

   //the purpose of static method -> produce sth by the input parameters
   // Static method should not access any object attributes/behavios, 放係邊都一樣

   Cat c3 = new Cat();
   System.out.println(c3.getAge()); //0, coz primitive type has default value (Notes.)

   Ball b = new Ball();
   // "Ball b" -> because Ball.class is "public class"
    // "new Ball()" -> because the constructor is "public"

    b.setColor("YELLOW"); // because setColor() method is "public" method

  
  }
  
}
