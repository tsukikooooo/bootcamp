import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  //attributes
  private String firstName;
  private String secondName;
  private double weight;
  private double height;

  //Empty Constructor     --->  XX return type
  public Person(){  //俾下面CALL 返constructor (syso)
  }

    //All Arugyments Constructor  //OBJECT 生產前GE 工具, 另一個係生產左之後先
  public Person(String firstName, String secondName, double weight, double height){  //<<???
      this.firstName = firstName;
      this.secondName= secondName;
      this.weight=weight;
      this.height=height;
  
      }

  //Attributes Persentation   ******* like add method
  public String fullName(){
    return this.firstName + " " + this.secondName;
  }
  //weight/height^2 ->Big Decimal
  public double bmi(){
    return BigDecimal.valueOf(this.weight).divide(BigDecimal.valueOf(Math.pow(this.height,2)),RoundingMode.HALF_UP).doubleValue();
  }


//To string()

public String toString() {
  return "Person:()" + this.firstName + this.secondName + "Weight:" + this.weight + "Height:" + this.height + ")"; 
}

  //convert bmi to stataic method  (Method) ** 一般放最低
  public static double bmi(double weight,double height){  
    return BigDecimal.valueOf(weight).divide(BigDecimal.valueOf(Math.pow(height,2)),RoundingMode.HALF_UP).doubleValue();
  }
  //public double inc(){
    //return BigDecimal.valueOf(this.weight).subtract(2.2);//??
 // }

  //get, set
  public void setFirstName(String firstname){
    this.firstName = firstname;
  }
  public void setSecondName(String secondname){
    this.secondName = secondName;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public void setheight(double height){
    this.height = height;
  }

  public String getFirstName(){
    return this.firstName;
  }
  public String getSecondName(){
    return this.secondName;

  }
  public double getWeight(){
    return this.weight;
  }

  public double getHeight(){
    return this.height;
  }
  //set last name
  public static void main(String[] args) {
    
  //"Person" is contructor  (need to use ^^ call)
  Person p1 = new Person(); //"new Person()" ---> create a Person Object in Memory.
  p1.setFirstName("Vincent");
  p1.setSecondName("Lau");
 
  System.out.println(p1.fullName());
  p1.setWeight(65);
  p1.setheight(1.7);
  System.out.println("p1's"+ p1.bmi());

  System.out.println(Person.bmi(65,1.7));

  System.out.println(p1.toString());

  // Create a person object with given attribute values
  Person p2 = new Person("Jenny", "Chan", 55,1.7);
  System.out.println(p2.fullName());
  System.out.println(p2.bmi());
  p2.setWeight(54);
  System.out.println(p2.bmi());

  Person p3 = p1;
  System.out.println(p1.getFirstName());
  System.out.println(p1.getSecondName());
  System.out.println(p3.fullName());

  //p1 change name p3 also change, coz object changed. check the graph. 
    p1.setFirstName("Sally");
    System.out.println(p1.getFirstName());
    System.out.println(p3.getFirstName());
  //Stack Memory :object reference,,, heap memory :Person object
  }
}
