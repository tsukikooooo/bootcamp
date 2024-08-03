package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person {
  private String name;
 // private Person person; <<low b

  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person());
    List<Person> persons2 = new LinkedList<>();
    persons2.add(new Person());

     long beforeTime= System.currentTimeMillis();

     for(int i = 0; i<1_000_000; i++){
      persons.add(new Person());

     }
     long afterTime = System.currentTimeMillis();

     System.out.println(afterTime-beforeTime); //28ms


    //person.add() and person2.add() are running different implemantation.
  }
  
}
