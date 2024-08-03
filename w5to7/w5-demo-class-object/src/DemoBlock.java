public class DemoBlock {

  private static int number;
  // private static int number2;
  private String name;

  // static block
  // 1. triggered once only, no matter the number of static variable(s)
  // 2. even no static variable, the static block still have
  static {
    System.out.println("start block");
    number = 3;

    System.out.println("end block.");
  }

  public DemoBlock() {
    System.out.println("calling empty constructor");
  }

  public DemoBlock(String name) {
    System.out.println("calling all args constrcutor....");
  }

  // instance block
  // none relationship with object
  // it is triggered when there is new object created
  // it is triggered before constructor
  // Usage : common logic between constructor
  { 
    System.out.println("start instance block.");
    name = "John";
    System.out.println("ENd");
    number = 10;
  }


  public static void main(String[] args) {
    System.out.println("Start");
    System.out.println(DemoBlock.number); // 3

    new DemoBlock();
    new DemoBlock("Ve");


    System.out.println(DemoBlock.number);
    System.out.println("End");

    /* result: */
    // step 1: execute static block
    // start block
    // end block.

    //step 2: run main method() -> System.out.println("Start");
    // Start

    //step 3: run main method() -> System.out.println(DemoBlock.number);
    // 3

    //step 4: run instance block and then run empty constructor coz of "new DemoBlock()"
    // start instance block.
    // ENd
    // calling empty constructor

    //step5: run instance block and then run all args constructor coz of "new DemoBlock("Ve");"
    // start instance block.
    // ENd
    // calling all args constrcutor....

    // step 6: run main method()
    // 10

    //step 7: run main method()
    // End
  }

}
