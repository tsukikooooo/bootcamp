import sorting.Customer;

public class Box<T >{ // <T> like unknown & any Type....,, primviatme 唔用得>> 用WAPPER CLASS...
  private T value;  
  
  //empty constructor !! must add...
  public Box(){

  }

  public Box(T value){
    this.value = value;
  }
  public T getValue(){
    return this.value;

  }

  public void setValue(T value){
    this.value = value;
  }

  // The U declared in static method has NO replationship to the T declared in attribute
  public static <U> Box<U> createBox (U value){ //俾範圍 <T> //static 邊到都一樣, 同其他無關係, U..
    return new Box<>(value);
  }

  public static void main(String[] args) { //run time 時, 決定 T 係咩
// Run Time: 
// u hv to define the type <T> during run time , [complier timedefine, 但run 時先知Object. ,,輕鬆D 唔洗寫Integer box. 寫小D class..]
    Box<Integer> integerBox = new Box<>(); //define whats box is " Integer", new Box<> create live
    integerBox.setValue(100); // int -> Integer
    Box<Customer> customerBox = new Box<>(); 
    customerBox.setValue(new Customer()); 

    //到你用個時先決定個, general logic, no to code more class.
//You cannot 
// Box<T> box = new Box<>();
  Box<String> stringBox = Box.createBox("hello");
  Box<Bird> birdBox = Box.createBox("Box");  
  }
}
