public class MethodDemo {
  private String firstName;

  public MethodDemo(){

  }
  public MethodDemo(String firstName){
    this.firstName = firstName;
  }
 //instance meth 本貿用黎操作stage
  public static void main(String[] args) {
    int x = sum(1,2);
    Integer x2 = sum(1,2); //sum() method returns int value -> autobox -> Integer Object
    long l = sum(1,2); //upcast, int value > long value
    //long l2 = sum(1,2); //int value - > long value -> long object(auto box)
    //Compiler would not do upcast and autobox at the same statement.

    // Call static method
    MethodDemo.sum(2,3); //return 5


    //No point to make sum2() become an instance method
    MethodDemo md = new MethodDemo();
    md.sum2(2,3); //return 5

    MethodDemo md2 = new MethodDemo("John");
    String john = md2.fullName("Wong");
    System.out.println(john);
 
  }

  public int sum(int x, int y){
    return x + y;
  }

  //sum2() didnt use instance method to produce the return value. So, it dont need to be instance method.
  public int sum2 (int x, int y){
    return x + y;
  }

  //Can we write this metod to static method? No , we cannot
  public String fullName(String lastName){
    return this.firstName + " " +lastName;

  }
  
}
