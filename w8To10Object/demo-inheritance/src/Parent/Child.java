package Parent;

public class Child extends Father{

  //implicitly empty constructor
 // public Child(){
   // super(); //背後CALL 寫唔寫都一樣
    //super("John"); //<< 你入返先過到.  but will not want all items call John so use super() 
    //, both hv empty constructor ...they will can wach other

  //}

  public Child (String name){
    super(name);

  }
  public static void main(String[] args) {
    Child c = new Child("Vin");
    Father f = new Father();  
    Father f2 = new Child("John"); 
  //Child c2 = new Father(); //not allowed, parents object cannot be assigned to child reference type
  }
  
  int x = 1 ; // x int object reference type , 1 > int value
}
