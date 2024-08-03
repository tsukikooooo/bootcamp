public class DemoStaticFinal {
  // Constant  >> logo >>LOGO
  // snakecase : LOGO_STRING
  private static final String LOGO_STRING; //static vaiables , finalized   ,,unchangeable by others? 
  private static String name; // static variable
 
  private static final double PI = Math.PI; // Math.PI > public static final double PI
  private final double salary = 0.0d ;//finalized instance variable, unchangeable by others
  

   //camelcase 
  private int age; //instance variable

  //triggered before main() method
  static{
    LOGO_STRING = "default";
  }

  //for outside, (when private , but want public to get age, you can getage)

  public int getAge(){
    return this.age;
  }

  public double getSalary(){  //instance variable
    return this.salary;
  }
//instance method can access both instance and static variable
  public String test(){
    return this.age + " " + name +" " + this.salary + " " + LOGO_STRING;
  }
// instance can get ??vaibale?
  public static String getName(){
    return name; //>>no this coz static
  }
//static cannot instance!
  public static String getLogo(){
    return LOGO_STRING;
  }

  //final is a java keyword. compiler would check all final variable has been initialized. 

//private final double salary ;
//private static final String logo;

public static void main(String[] args) {
  //INstance variables
  DemoStaticFinal dsf = new DemoStaticFinal();
  dsf.age =10;
  System.out.println(dsf.age);
  //dsf.salary = 1000; //Compile error, salary is final variable.
  System.out.println(dsf.salary); // 0.0  << cannot change ^
  DemoStaticFinal dsf2 = new DemoStaticFinal();  
  dsf2.age = 20;

  System.out.println(DemoStaticFinal.LOGO_STRING); //Default  
  DemoStaticFinal.name = "Vincent";
  
  //You cannot assign "static final" variable in main() method, its too late.
  //  LOGO_STRING = "default";

  //static block before method.

}




}
