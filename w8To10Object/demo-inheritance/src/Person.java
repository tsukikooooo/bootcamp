public abstract class Person {  //abstract<<< cannot create new object, is visval. 
   
  private String name;
  private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }
  public static void main(String[] args) {
  //   abstract class CANNOT creat object 
  //  Person p = new Person("Vincent", 13); <- Cannot instantiate the type Person because of abstract class cannot create new object

    //Student.class is public
    //Student.calss constructor is public
    Student s = new Student(1,"Vin", 13);

    // peron object parent near student 
    // getValue() not 
  }
}
