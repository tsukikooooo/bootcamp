import java.util.Random;

public class DemoRandam {
  private int baseSalary = 6000;

  public void setBaseSalary(int baseSalary){
    this.baseSalary = baseSalary;
  }
  public static void main(String[] args) {
    //JDK
    // random > usually integer

    //instatic method >> vincent tought use static method is better coz enough information .
    int random = new Random().nextInt(3); //0-2
    System.out.println(random);
    int random2 = new Random().nextInt(3)+1;//1-3
    System.out.println(random2);
    int random3 = new Random().nextInt(3-1)+1;// 0-1 + 1> 1-2
    System.out.println(random3);

    //49 or 50

    int randow4 = new Random().nextInt(2)+49;
    System.out.println(randow4);


    DemoRandam dr = new DemoRandam();
    System.out.println(dr.sum(2, 3));//5  //object can instance method
    System.out.println(DemoRandam.sum(2,3)); //5

    DemoRandam dr2 = new DemoRandam();
    dr2.sum2(2, 3); // 5
    DemoRandam dr3 = new DemoRandam();
    dr3.sum2(2, 3); // 5
  }

    public int getSalary(int bonus){
      return this.baseSalary + bonus;
    }
    //tools better to use static method, no relationship with object so static.
    public static int sum(int x, int y) {
      return x + y;
    }

    //bad design, not complate
    public int sum2(int x, int y){
      return x + y;
    }
  }

   

