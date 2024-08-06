import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListDemo { //

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>(); //ArrayList.class implements List.class <<why not ArrayList? is use"List"
    strings.add("hello");  //inside have differnt method. , implement contact
    strings.add("abc");
    strings.remove("abc");
    System.out.println(strings.size());

    //ArrayList.class has ALL methods defined in List.class
    //ArrayList MAY implement more than one interface
    //ArrayList MAY have its own methods, which did not define in interfaces

    //Polymorphism
    //1. Compiler time : Scope of Strings(obj ref) , String some method cannot call.
    //2. Run time: method implementation 

    //Collection.class   
    Collection<String> string2 = new ArrayList<>(); //collection method: list Quene, set ,collection has add coz h  
    //(換object 就用collection)
    //arraylist , hashcode : 放野一樣, 但搵野不同
    string2.add("hello"); 
    string2 = new HashSet<>();
    System.out.println(string2.size()); 

    //Set.class
    Set<String> string3 = new HashSet<>(); //cannot change array list object in Set pearents, difeerent

    //strings3 = new ArrayList<>(); // NOT OK,ArryList.class didnot implement set interface.
    strings.add("hello"); //ignore duplicate

    //so, the implemention of ArrayList.add() differ to implementation of HashSet.add

   // 其實越窄指針越有用處..

    //Map.class X collection
    Map<String, String> nameMap = new HashMap<>();
    
    //Data of structure of data.
    //Set 好多
    
    // Data Structure of data structure
    List<HashMap<String, String>> maplist = new ArrayList<>();
    HashMap<String, String> nameList = new HashMap<>();
    nameList.put("abc", "John");

    HashMap<String, String> bookList = new HashMap<>();
    nameList.put("def", "Book A");
    maplist.add(nameList);
    maplist.add(bookList);

  }
  
}
