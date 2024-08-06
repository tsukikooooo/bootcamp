package ArrayListReview;

import java.util.ArrayList;

public class ExampleArrayList {

  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Ice");
    names.add("Peter");
    names.add("Sasa");

    System.out.println(names);

    names.add(1,"Peter2");
    System.out.println(names);

    names.add(2,"Peter");
    System.out.println((names));
    for(String i: names){
      System.out.println(i);
    }

    System.out.println(names.get(4));
    names.clear();
    System.out.println(names.size());

  }
  
}
