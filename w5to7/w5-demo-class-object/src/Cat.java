public class Cat {  //Class Name -> Name Convention -> able to describe physical object
  //State   changable/ non-changable 
  // attributes   do not hv relationship with Main
  private String name;  //unchange
  private int age;  //change

// What is "this"?? 

//if No constructor is defined.
//by default the class implicityly has a empty constructor  再define佢就會無左

  //behavior
  // instance method
  // setAge is a method that can be called by object only.
  //For example, Cat c1 = new Cat();
  //c1.setAge(13);
  //"this" --> the object pointed  by c1
  



  //void : return type, requires return nothing
  public void setAge(int age) { //修改妝態=void   class: 藍圖, >> 變object: cat (live)  猫身上有setAge工具
    this.age = age; //object 入面CAT  , age 自動知係L11 age 
  }
 //tools 2 of cat
  public void setName(String name){  //L4 != L15 Name
    this.name = name;
  }
  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

 // instance method
 public String describe(String x) {
  return "The age of this cat is " + this.age + ", and name of this cat is "
      + this.name + " " + x;
}

// static method
public static String hello() {
  return "hello";
}

public static String hello(String s) {
  return s + "!!!";
}

public boolean isTooOld() { //use boolean is better to share coode
  
  return this.age >10;
}

public static void main(String[] args) {

  // the purpose of static method -> produce something by the input parameters
  // static method should not access any object attributes/ behaviors
  System.out.println(Cat.hello()); // hello
  System.out.println(Cat.hello("goodbye")); // goodbye!!!
 // System.out.println(Book.hello()); // hello

  System.out.println(3); //

  // how to call describe()
  // instance method is able to access (read & write) the object attributes
  Cat cat = new Cat();
  cat.setAge(13);
  cat.setName("ABC");

  Cat c1 = new Cat();
  c1.setAge(10);
  
  // The age of this cat is 13, and name of this cat is ABC .
  System.out.println(cat.describe(".")); 

 if (cat.getAge() > 10){
  //consult doctor...
 }
if(cat.isTooOld()){

}
}

}
  

