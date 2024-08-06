import java.io.ObjectStreamException;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    //key & value pair (name?)
    HashMap<Integer,String> nameMap = new HashMap<>(); //key > Integer ,  value > String ,, << can be <Integer, Class> , key通常string int... value可以complete
    nameMap.put(100,"Vin");  //要放岩位置,  
    //nameMap.put("Vin", 100); NOT OK 

    //We can get value by key.
    System.out.println(nameMap.get(100)); //Vin

    //We CANNOT get key by VALUE.
    System.out.println(nameMap.get("Vincent")); //XXX null

    //No ordering
    nameMap.put(1010,"Cindy");
    nameMap.put(-45,"Sasa");
    System.out.println(nameMap.get(-45)); //Sally

    //Key + Value > entry 
    //A map consists of many entries

    //For LOOP > HashMap.class  (entry not hashMap)
    //Loop for entries
    for(Map.Entry<Integer, String> entry : nameMap.entrySet()){  //每個LOOP ASSIST 1 ENTRY
      System.out.println("key=" + entry.getKey() + ", value = " + entry.getValue());
      
    }
    // Handle duplicated key  --> Override the value if the key exists
    nameMap.put(1010, "Peter"); //auto override
    System.out.println(nameMap); //{1010=Peter, 100=Vin, -45=Sasa}

    //null Key
    nameMap.put(null, "Oscae"); //OK
    System.out.println(nameMap);  // can overide

    //null value
    nameMap.put(-45, null); 
    System.out.println(nameMap); //{null=Oscae, 1010=Peter, 100=Vin, -45=null}

    //remove
    nameMap.remove(1010);
    System.out.println(nameMap); //{null=Oscae, 100=Vin, -45=null}

    String oldValue = nameMap.remove(-45); //remove entry by key
    System.out.println(nameMap); 
    System.out.println(oldValue); //null (has save the value before del and return to you)

    System.out.println(nameMap.containsKey(-45)); //false , 需要用> 因為加怪野

    //Loop keyset()
    for (Integer x : nameMap.keySet()){
    System.out.println(x);
    }

    //Loop values
    for (String x : nameMap.values()){
      System.out.println(x);
    }
    System.out.println(nameMap.size());
    System.out.println(nameMap.containsValue ("Peter"));
    System.out.println(nameMap.get("Peter"));// can use null
     
      
    //put 
      
    }
    
  }
  

