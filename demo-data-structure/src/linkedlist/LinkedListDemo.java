package linkedlist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
  public static void main(String[] args) {
    
  
   // Array vs ArrayList -> 
   //1.Underlying structure of ArrayList is array. 
   // 2. array -> fixed lenth ->a range of continous memory locations

    //oppsite of array, how to use memory?

    Cat cat = new Cat(Color.BLUE); 
    //Heap 
    //Step 1:Cat Oject
    //Strp 2 : Eyey Arraay Object
    //Step 3: Two eye objects
    //Step 4: 3 color objects (created when you excutiethe main method)
    
    
     cat.getEyes();   // cat object -> get Eye Array Object
     cat.getLeftEye();  // Cat object -> Eye Array Object -> Eye Object

      Eye[] eyes = cat.getEyes();
      Eye right = eyes[1];

      //Whats is the relationshop bewteen the memory location  of cat, eyes, rightEye?
      //1. Eye[] (array)
      //2.Cat obj vvs Eye[] object
      //3. Cat object vs eye object

  
      String[] strings = new String[10000000];

     // LinkedList<String> strings2 = new LinkedList<>(); //run time : call linked list , 透過data structure  control 
      List<String> strings2 = new LinkedList<>();
      strings2.add("A");
      strings2.add("B");
      strings2.add("C");
      strings2.remove("B");
      strings2.remove(0);
      strings2.add("D");
      for (String s : strings2) {
        System.out.println(s);
      }

      //arr 係直接加7,但linklist 唔係, 
      //why array only can arr[arr.length-1]

      System.out.println(strings2.get(strings2.size() - 1)); 
      // arr[arr.length - 1];

      //LinkedList vs ArrayList
      //1. Underlying DS
      //2. Method Differefnce(i.e LinkedList > addFirst() , removeFirst())
    //  Linkedlist 儲D 連續GE 

      LinkedList<String> ll = new LinkedList<>(); //linkedList :left , Arraylist: right XX 兄弟關係唔可以替換, 如果用list 右邊可以ARRAYLIST

      // //if x = 3;
      // ll = new ArrayList();
      // else x >2;
      // ll= new linkedlist();
//complier time VS run time, 


      ll.add("hello");
      ll.addFirst("abc"); //list dont hv addFirst,,Linkedlist hv. 
      ll.add("def");
      for(String s:ll){    //algortainh, linkedList 要run 晒先做, arrayist 係直接.
        System.out.println(s);
      }
      ll.removeFirst();
      for(String s : ll){
        System.out.println(s);
      }
      System.out.println(ll.indexOf("abc"));

      ll.add("hello");
      System.out.println(ll.lastIndexOf("hellow"));

      //Another char
      //Quene.class 
      //not too first....functionUP >>time UP  COZ build up by LinkedList
      //ex: shopping center for purchase iphone,the quota as excsely 10,,not too much 搶購..show the quene of number.
      //唔可以係中間拎野出黎! 
      Queue<String> emails = new LinkedList<>() ;  //Quene is interface , need class to build...
      emails.add("abc@gmail.com");
      emails.add("peter@gmail.com");
      System.out.println(emails.size()); //Collection.class
      String head = emails.poll(); //return and remove the first element in quene. [ poll=水管, oneway] poll左就無左

      System.out.println(head);
      emails.add("sally@gmail.com");
      emails.add("dick@gamail.com");
      //for-each

      String lookup = emails.peek(); //return the first element in queue
      System.out.println(lookup);//peter@gmail.com

      //remove()
      System.out.println(emails); //sames as poll
      emails.remove();

     emails.remove(new String("dicky@gmail.com")); //call equals() , even u create new object.
    //LinkedList.class remove(Object) > FOr loop

      for(String s : emails){   
        System.out.println("Skip first" + s);  // 每行都print 埋skip..正常quene 用while loop , 好小用for loop.

      }
      // //Convert Quene <String> to List<String>
      // while(!emails.isEmpty()){ //isEmpty
      //   System.out.println(emails.poll());

      
      //Convert Quene <String> to List<String>
      List <String> strings4 = new ArrayList<>();
      while (!emails.isEmpty()) { //is Empty
      //  System.out.println(emails.poll());
        strings4.add(emails.poll());
      
      }
      System.out.println(strings4);

      //List : 希望你CALL INDEX, if u know the location use linkList?  linklist 無參數inplement....

      System.out.println(emails.contains("abc@gmail"));

      //clear()
      strings4.clear(); // clear all the objects inside the ArrayList Object.
      strings4.add("abc");
      strings4 = null; // can u use null<<< if u use null""as 清空成間屋"
   //** */   strings4.add("def"); //NPR (null pointer exception) >> Run time error.......TAT

  }
}
