public class ArrayDemo {
 
  public static void main(String[] args) {
    //Array
    int[] arr = new int[] {1,2,3}; //right hand side: array object
    //Left hand side : arr os an boject reference.

    //Integer [] integers = new int[] {1,2,3}; //NOT upcasting
    Integer [] integers = new Integer[] {1,2,3}; // upcast , 1 (int value) -> Integer Object with value1
    //Answer:4: obejects in total;
    //1.Array Obj
    //2. Integer Obj with value 1   //1個Obj 3 拍針
    //3. Integer Obj with value 2
    //4. Integer Obj with value 3
     System.out.println(integers[2]); //3, integers[2] - > storing the address of "Integer object with value 3"

  }
}
