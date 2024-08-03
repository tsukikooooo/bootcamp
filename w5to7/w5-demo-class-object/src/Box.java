import java.util.Arrays;

public class Box {
  
  //static variable (belongs to class)   ///no relatioshop with box.now
  private static String prefix = "apple";  //object can call it; 每個BOX 都可以有依個附帶 variable. 
  //save space, no status, each object >>> not each oject want to use , so as static variable is better thans/.
//X instance variable,  每個BOX 前面都有, 就唔洗咁晒位

  //instance variable
  private String name; 
  private String[] strings;

  //public Box(String[]strings
      // 依個寫得唔好開個BOX俾佢
    //this.strings = strings;
  //}
  public Box(){
    this.strings = new String[0]; //user is comfuden... 唔洗new String, 用家就知可以不停放D string 落去
  }

  public void setName(String name){
    this.name = Box.prefix.concat("-").concat(name);
  }
  
    public String getName(){
      return this.name;
    }
  public String[] getStrings(){
    return this.strings;
  }


  public void setString(int index, String s){
    this.strings[index] = s;
  
  }
//???
  public void addString(String s){
    String[] arr = new String[this.strings.length + 1];  //create new arr to store new array.
    for (int i = 0; i < this.strings.length;i++){
      arr[i] = this.strings[i];
    }
    arr[arr.length - 1] =s;  //last elements
    this.strings = arr;  //replace, object arrow to new 
    //arr is local variable , after run, will destory.
  }

  public void deleteString(String s){
    //revise the arr length
    // remove corresponding Strings  remove all hello
   String[] arr1 = new String[this.strings.length - 1];
   for (int i = this.strings.length; i < 0 ; i--){
     arr1[i] = this.strings[i];
   }

  }

  public String toString(){
    return "Box(" + "strings=" + Arrays.toString(this.strings) + ")";
  }


  public static void main(String[] args) {
   // Box box = new Box(new String [] {"hello","abc"});
    Box box = new Box();
    box.addString("hello"); // user's side it can find only check 
    box.addString("hello");
    System.out.println(Arrays.toString(box.getStrings()));
    System.out.println(box); //Box(strings = [hello,abc])  need to check.

    ///if same hello gelo
    //?
    box.setString(1, "world"); //本身hello 1 object, now change to 2 object.
    System.out.println(box);

    box.addString("xyz");
    System.out.println(box);  //Box[hello, world, xyz]

    System.out.println(Box.prefix);

    Box box2 = new Box();
    box2.setName("Moon");
    System.out.println(box2.getName());

  }
}