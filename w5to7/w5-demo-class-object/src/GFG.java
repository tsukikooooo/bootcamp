public class GFG {
  public GFG(int x) {
    System.out.println("ONE argument constructor");
  }

  public GFG() {
    System.out.println("No  argument constructor");
  }

  static {
    System.out.println("1st static init");
  }

  {
    System.out.println("1st instance init");
  }

  {
    System.out.println("2nd instance init");
  }

  static {
    System.out.println("2nd static init");
  }

  public static void main(String[] args) {
    new GFG();
    new GFG(8);

    // result:
    // 1st static init
    // 2nd static init
    // 1st instance init
    // 2nd instance init
    // No argument constructor
    // 1st instance init
    // 2nd instance init
    // ONE argument constructor
  }
}
