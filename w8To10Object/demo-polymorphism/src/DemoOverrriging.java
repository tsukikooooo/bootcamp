public class DemoOverrriging {  //dynamic polymorphism (run- time)
  
  public static void main(String[] args) {

    //Ex 1 (noraml use)
    Animal animal = new Cat();  // use animal call cat method. ?? object
    animal.walk(); //Compile-time checks the scope of the object, but not the implementation.
   // animal.run(); //Compile error, because Animal.class has walk() ONLY.


   //During runtime, the new cat object is created in heap memory,
   //then the object ref "animal" will point cat object and execute walk() method.
   //That is Cat.walk()


   //Ex 2
   Animal animal2 = new Animal();
   //No relationship with Cat.class or Dog.class
   animal2.walk(); 
   //During runtime, the new cat object is created in heap memory,
   //then the object ref "animal2" will point to animal object and execute walk() method.
   //That is Animal.walk()

   //Ex 3.
   animal = new Dog(); //上面已整左個拍針, 我地重用
  // animal.sleep(); //error, coz the obj ref. type determined the scope of the obj.
   
   animal.walk(); //no override, so inhierr animal //animal is walking
    // cox Dog.class does not overrige the walk()method.
    //XX one time object  
    //compiler only check the type of relationship. 


    //RUN time, only have sender and receiver.
    //dynamic 

    // note: type casting 
    //L9: int + int  overflow  (先加左先)
    //L10: long + int >> long + long  (不同..)

  } 
}
