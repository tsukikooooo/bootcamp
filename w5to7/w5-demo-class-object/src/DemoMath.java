public class DemoMath {
  public static void main(String[] args) {
    //abs()
    int x = -3;
    int y = 8;
    int result = Math.abs(x * y); // int * int >> int   .//.abs 絕對值
    System.out.println(result); //24

    double d =3.3d;
    double result2 = Math.abs(d * x); // double * int >> double
    System.out.println(result2);

    long l = 5562222L;
    long result3 = Math.abs((l * x)); // long * double X long , double X double
    System.out.println(result3);

    //max()
    System.out.println(Math.max(10,9)); //10
    System.err.println(Math.max(-10, 9)); //9

    int [] arr = new int[] {4,-3,10,2};
    int max = Integer.MIN_VALUE;
    for (int i = 0; i< arr.length;i++){
      max = Math.max(max,arr[i]);
    }
      System.out.println(max);

    // round()  fast , 
    double d1 = 3.65d;
    System.out.println(Math.round(d1)); //4
    System.out.println(Math.round(3.4)); //3
    System.out.println(Math.round(3.7)); // 4 

      //pow () 次方
    double r4 = Math.pow(2,3);
    System.out.println(r4); //8.0
    System.err.println(Math.pow(2.2,3)); // 10.6480000003 精度問題

    // square()
    System.out.println(Math.sqrt(25)); // 5
    System.err.println(Math.sqrt(24)); //4.89897XX
    System.out.println(Math.sqrt(-26)); //NaN < 負數不能用出NaN

    // random()
    System.out.println(Math.random()); // 0.0 and 1.0 to show num. ///0.1534447782447663
    //可以kr1gg1
    System.out.println(Math.random()*100); //可以乖返, 變大數
    System.err.println(Math.round(Math.random()*100)); // 0-100  


    // log()
    


  }
  
}
