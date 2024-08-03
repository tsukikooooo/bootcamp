import java.util.Arrays;

public class Bag {
  private int[] integers;


  // constructor
  public Bag() {
    

  }
  // dummy ( for test constructor only)
  // public Ball(String colour, double weight){ << 2String 一樣唔當重覆, 但duplicate 唔得
  // this.weight =weight;
  // this.color = color;
  // }

  public Bag(int[] integers) {
    this.integers = integers;
  }

  // getter, setter
  public int[] getIntegers() {
    return this.integers;
}


public void setIntegers(int[] integers) {
  this.integers = integers;
}

  public boolean searchIntegers(int n){
    boolean result = false;
    for (int i = 0; i < this.integers.length; i++){
      if (this.integers[i] == n){
        return result = true;
      }
  }
  return result;
}



  // toString()
  public String toString() {
    return "Bag()" + "intergers:" + Arrays.toString(this.integers) + ")";
  }

  public static void main(String[] args) {
    int[] integers = new int[] {3, 1, 2};
    Bag b1 = new Bag(integers); // b1 再整一個OBJECT , NEW 代表有幾多個新OBEJECT
    System.out.println(b1.toString());
    int[] x = b1.getIntegers();
    System.out.println("X = " +Arrays.toString(x)); // [3,1 ,2]
    b1.setIntegers(new int[] {5, 6, 7}); // >> heap memory integers , 變化: int[] object

    // 對於38 前B1 係local variable

    // Bag(integers = [100,-2,6])
    System.out.println(new Bag(new int[] {100, -2, 6}).toString()); // no name

    String s = "ijk";
    s.charAt(0);

    // method 2
    // public static void test(){ // new method , 又重新一次
    // Bag b1 = new Bag();

    // int[]object object 係GET VALUE 所生產GE INTERGES (主角黎)
    // = 左邊係指針, so b1 has changed ti
    // = new bag(new int[]{19})<<<<又再轉\

    System.out.println(b1.searchIntegers(7));
  }
}
