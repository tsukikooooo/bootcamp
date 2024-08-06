import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListdemo {
    public static void main(String[] args) {  //??? why ? throws Exception?
     Integer[] integers = new Integer[] {2,10,-4};   //<< array 係最底層array, cannot know the source code
      //for each
      int sum = 0;
      for (Integer i : integers){
        sum += i;
      }
      System.out.println(sum);

      //1. remove 10
      integers[1] = null; //[2,null,-4]  if want to del 10, we need to use null to replay.

      //2. remove 10 , and re-create array > [2,-4]
      Integer[] arr = new Integer[integers.length -1];

      

      //ArrayList   
      ArrayList<Integer> intergers2 = new ArrayList<>(); //(): call constructor of ArrayList.class
      intergers2.add(2);  //佢寫左method , 你再call 佢
      intergers2.add(10); //can add anyline you want
      intergers2.add(-4);  // for loop , 對比array 係慢左DD 

      sum = 0;
      for (Integer i : intergers2){
        sum += i;
      }
      System.out.println(sum);  //8
      //Difference between Integer[] and ArrayList<Integer>
      //1. Initialization : Array (fixed length), ArrayList (Variable length) 除非爆ram., 正常唔爆
      //2. Underlying structure: Array is a raw DS in Java, ArrayList is a class(array)

      System.out.println(intergers2.size()); // 3
      intergers2.remove(1); //10    通常remove by integer
      System.out.println(intergers2); //[2,-4]

      //set arraylist  .. 留意有無影響性能
      intergers2.set(1,-100);
      System.out.println(intergers2); //[2,-100]


      //index of / contains is loop
      System.out.println(intergers2.contains(2)); //true

      System.out.println(intergers2.indexOf(-100));//1 
      System.out.println(intergers2.indexOf(-1000)); //-1

      intergers2.add(2); //[2, -100,2]
      System.out.println(intergers2.indexOf(2)); //0   namely convention 

      System.out.println(intergers2.lastIndexOf(2)); //第3個係2, 

      System.out.println(intergers2.subList(1, 3)); //from index 1 to index 2 (endindex -1  [-100,2])
      //return new array list to u , like big decimal

      System.out.println(intergers2); // [2,-100,2]

      //addAll()
      ArrayList<Integer> integers3 = new ArrayList<Integer>();
      System.out.println(integers3.isEmpty()); //true  , isEmpty looke like size?

      integers3.addAll(intergers2); //入面幫你for loop
      System.out.println(integers3.isEmpty()); //false

      System.out.println(integers3); // [2, -100, 2]
      

      ArrayList<String> strings = new ArrayList<>(); 
      //u can skip the type declaration when you create the arrayList object
      //by default it follow the type specified at the left hand side

      strings.add("hello");
      strings.add("abc");
      strings.add("world");
      strings.remove(1); //remove"abc > ["hello", "world"]

      System.out.println(strings.add("1Hello"));
      strings.remove("hello"); //  >>> remove by object
      System.out.println(strings); // [world, 1Hello] , remove "hello"this world, if type wrong name wont remove


      //get by index: get()
      System.out.println(strings.get(0)); //

      // Question 1: Given String[], remove those string with length <= 3
    String[] stringArray = new String[] {"anc", "a", "", null, "aaaa"};
    ArrayList<String> result = new ArrayList<>();
      for(String s : stringArray){
        if (s !=null && s.length() > 3){
          result.add(s);
          
        }
      }
      System.out.println("result:" + result);
      

    // Question 2: Given Person[], retrieve all customer object with age > 30 or
    // name startsWith "J"
    Customer[] customers = new Customer[] {new Customer(40, "Mary") //
        , new Customer(31, "John") //
        , new Customer(29, "Jason") //
        , new Customer(29, "Cindy")};
      ArrayList<Customer> newcustomers = new ArrayList<>();
       for (Customer a : customers){
        if (a.getAge() > 30 || a.getName().startsWith("J")){
          newcustomers.add(a);
        }
       }
    System.out.println("newcustomers:" + newcustomers);

      ArrayList<Object> objects = new ArrayList<>();  //object:topclass, biggest parent
      objects.add(new String("abc"));
      objects.add(1);
      objects.add(LocalDate.of(2024,5,22));
      objects.add(new HKID("A123455"));

      // Polymorphism Part 2 : runtime > implementation
      for(Object object : objects){
        if(object.equals(new String("abc"))){  // string object equals() 先知佢查生左STRING L91/L98 different obj. ** 個equals() 有冇override 左
          System.out.println("hello");
        
          
    
        }else if (objects.equals(new HKID("A123455"))){ //hkid object equals()
          System.out.println("hello2");

        }else if (object.equals(new Integer(1))){ //integer object equals()
          System.out.println("hello3");
      
        
        }else if (object.equals(LocalDate.of(2024,05,21))){ //LocalDate equals()
          System.out.println("hello2");
      }
      }
      //print 
      //check if the object equals to xxx
      //Compare the different between ArrayList<Object> and ArrayList<String>
    }
}
