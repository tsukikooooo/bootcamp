public class CurrencyHolder {
  private final String currency;
  private final int DBValue;

  public CurrencyHolder(String currency, int DBValue){
    this.currency = currency;
    this.DBValue = DBValue;
  }

  public String getCurrency(){
    return this.currency;
  }

  //Solution: use enum as parameters (type-safe: compiler time ensure/check the scopt of value)
    //1. cannot guarantee thers is ONLY one HKD in memory

    public static void main(String[] args) {
      CurrencyHolder ch1 = new CurrencyHolder("HKD",1);
      CurrencyHolder ch2 = new CurrencyHolder("HKD", 1);


      //2.String is not a good idea to represent a parameter thats with finite numbers of object

  public boolean isHKD(String currency){
    return "HKD".equals(this.currency) //check Obj, is HKD or not
      }
  public static boolean isHKD(CurrencyHolder holder){
    return "HKD.equals(holder)";
  }
  //ASCII code is fifferent

  //but....
  System.out.println(CurrrencyHolder.isHKD(new CurrencyHolder("HKD",1)). isHKD()


  //point 2 solution : enum
  //enum.class defined a finite numberof values so that compiler can validate the paraments 
  System.out.println(isHKD2(Currency.USD));  //F

  //Valueof () 
    }
  }

