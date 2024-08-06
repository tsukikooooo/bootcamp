import java.util.HashMap;
import java.util.Objects;
import java.math.BigDecimal;

//List <HKID>
public class HKID {
  private String value;

  public HKID(String value){
    this.value = value;
  }
  
  public String getValue() {
    return this.value;
  }

  @Override
  public String toString() {
    return "HKID = " + this.value  + ")";
  }

  //if u dont override equals() and hashCode()
  //its extends them from Object.class
  //so we compare "hkid object 1" and "hkid object 2"  address . ..//developer 唔多關心address.

  //if you override equals() and hashCode(), 
  //if implies that u want to define the defination of object.
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof HKID))
      return false;
    HKID hkid = (HKID) obj;
    return Objects.equals(this.value, hkid.getValue());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.value);
  }

  public static void main(String[] args) {
    HashMap<HKID, Customer> customerMap = new HashMap<>();
    // "A1234567", 34, "John"
    // "H2345678", 18, "Jenny"
    customerMap.put(new HKID("A1234567"),new Customer(12, "John") );
    
    HKID hkid = new HKID("H123456");
    Customer customer = new Customer(12,"Jenny");
    customerMap.put(hkid, customer);//put() logic: compare existing keys and the new key. **HKID is new class,  equals()係hirreabde, 要寫返
    

    //duplicate key "A1234567"
    //put one more customer with same key -> "A1234567" , 34 , "John"
    customerMap.put (new HKID("A12345"), new Customer(21, "Oscae")); //佢無reput , change to add.. , put :use hash to...
    // 1. equals(自己定) 2.hashcode
    System.out.println(customerMap); //3 entried . Why?  why cannot replace?

//WHY? how to solve?
//Solution: Override equals() and hashCode() in key.class (HashMap<key, Value>)
    System.out.println(new HKID("1234").equals(new HKID("1234"))); //true < why ? coz override equals() and hashCode() << 2個唔同Object.
 
    
    //put()  -> use equals() and hashCode() 
    //objectives of equals() and hashCode(): identify if they are same object
    //HashMap.calss equals() is to identify if they are same entry ** remember
    //hashmap ::put medthod:: 係咪同一個key, 你係可以參與

    //put() program flow: hashmap.put(key, value) > class key.equals() & key.hashCode()
 //一個method call 另一個method, 作者係唔需要預先知你method?

// How about HashMap<String, String>?
//String.class, Integer.class is already done. You cannot change the iplementation of equals() and hashCode()
//so String.equals() is compare the value it self to detemine if they are same object.
System.out.println(new Integer(129).equals(new Integer(129))); //true //除左?/? 其他 == 都係錯, ERUM 係可以==
System.out.println(new Integer(129)==(new Integer(129))) //false

//primivate 唔可以放, 其他可以
  }
}
