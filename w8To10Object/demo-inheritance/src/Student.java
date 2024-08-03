//Person.clasee is

import java.sql.Struct;

public class Student extends Person{ //Person not objec?, live in student object

  private int studentId;

  private String name;
  //private String studentId;
  //private int age;


  //Constuctor > the process of constructing student object
  public Student(int studentId,String name, int age) {//(String name, String studentId, int age){
    
     //calling Parent Class constructor...
  //  1. create Parent object inside Student Object (heap object)
    super(name, age);// <<< call paraent contrustor 
    this.studentId =studentId;
 // this.studentId;
  //this.age;
  }
// 2. call parent object setAge() method
  public void setAge(int age){ 
    super.setAge(age + 10);
  }

  public static void main(String[] args) {
    Student s = new Student(1, "Vin", 13); //Student Object is heap memory
    System.out.println();
    };
  }
  

