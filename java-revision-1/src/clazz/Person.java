package clazz;

public class Person {
  
  private String name;  //if you use public here, it implies the source value canbe read and replaced by others. (give up encapsulation)
  private int hkid;

//constant << only this case use public  PI**大階
  public static final double PI = Math.PI;

  public String getName(){
    return this.name;
  }

  public int getId(){
    return this.hkid;
  }

  //By default a class implicity contain empty constructor
  public Person(){

  }

  public Person(String name, int hkid){
    this.name = name;
    this.hkid = hkid;
  }

  public void eat(){

    }



  
}

