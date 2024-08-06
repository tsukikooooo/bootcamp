import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("hello");
    strings.add("abc");
    strings.add("def");
    strings.add("bbb");
    System.out.println(strings); //[abc, def, hello] , ordering is not determined by insertion order (cannot control)

    ArrayList<String> strings2 = new ArrayList<>();
    strings2.add("hello");
    strings2.add("abc");
    strings2.add("def");
    System.out.println(strings2);//[hello, abc, def] ,order follows the insertion order. 

    //add duplicated string value
    boolean hsResult = strings.add("hello");
    boolean alResult = strings2.add("hello");

    System.out.println(hsResult); //false
    System.out.println(alResult); //true
    System.out.println(strings); //[abc, def, hello]  HashSet .add method would check is it any duplicated. not adding duplicate value
    System.out.println(strings2); //[hello, abc, def, hello]   add duplicate and line the qu.


    System.out.println(strings.size()); //3
    System.out.println(strings.remove("abc")); //HashSet can remove by object
    System.out.println(strings.contains("def"));

    //isEmpty
    //addAll()

    //**次序, reject depulicate value */

    //Exercise
    String[] arr = new String[] {"abc", "def", "xyz", "def"};
    //loop
    
    // Question 1: Remove duplicated value
    HashSet<String> result = new HashSet<>();
    
    for(String s : arr){
      result.add(s);
      
    }
    System.out.println(result); //["abc", "def", "xyz"]

    //Q2. find all duplicate value
    HashSet<String> result2 = new HashSet<>();
    ArrayList<String> arrlist = new ArrayList<>();
    for(String s : arr){
      if(!result2.add(s)){  //results2, 指cut 左重覆, 咁就cut左
        arrlist.add(s);
      }
    }
    System.out.println(arrlist);

// //Question 1: Given String[], remove those string with length < =  3 
    String [] stringArray = new String[]{"abc", "a", "" , null, "aaaa"};
    ArrayList <String> result3 = new ArrayList<>();
    
    for(String s : stringArray){
      if( s!= null && s.length()>3);// use && 特式, 前面FALSE 就唔會CHECK後面
      result3.add(s);
    }

    //loop
    System.out.println(result3); //["aaaa"]


    // //Question 2: Given Person[], retrieve all person object with age > 30 or name startsWith "J"
    // Customer [] customers = new Customer[]{new Customer(40, "Mary"), new Customer(31, "John"), new Customer(29, "Jason"), new Customer(18,"Mary")};

    // ArrayList<Customer> customersList = new ArrayList<>();  //arraylist 特性
    // for (Customer c: customers){
    //     if( c.getAge() >30 ||c.getName() != null && c.getName().startsWith("J")){
    //       customersList.add(c);
    //     }
    //   }
    //   System.out.println(customersList);

  }
  
}
