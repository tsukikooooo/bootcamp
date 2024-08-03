public enum Currency {
  HKD("Hong Kong Dollar,",1), //similar to new Currency("Hong Kong Dollar.")
  USD("US Dollar",2),
  JPY("YEN",3), //可以附加variable 落obj.
  ;

  //instance variable
  private String description;  //not public, 唔係你NEW, JVM new的
  private int DBvalue;  //寫唔寫final都得, 因為係private 又無Set.  XXstatic

  //Constructor
  private Currency(String description, int DBvalue){
    this.description = description; //so HKD need to defind, (coz not empty constructor)
    this.DBvalue = DBvalue;
  }

  //instances methods
  public String getDescription(){
    return this.description;
  }

  public int getDBvalue(){
    return this.DBvalue;
  }

@Override //通常有value 就override, 永遠最底層可以override
  public String toString(){
    return "Currency(description= " + this.description + "DBValue" + this.DBvalue;
  }
  //given 2 , return USD
  public static Currency get(int DBValue){
    for (Currency curr:Currency.values()){
      if(DBValue == curr.getDBvalue())
      return curr;
    }
    return null;
  }
  public static int get(Currency currency){
    return currency.getDBvalue();
  }

   public static String fullDescription(Currency currency){
  //   if (currency == Currency.HKD){
  //     return "It is Hong Kong Dollar.";
  //   }else if (currency == Currency.USD){
  //     return"Hello world";
  //   }else if (currency == Currency.JPY){
  //     return String.valueOf(currency.getDBvalue());
  //   }
  //   return null;
  // }

  // Alternative: switch (before java 14) + enum(prefect match)
  switch (currency){
    case HKD:
      return"It is Hong Kong Dollar.";
      
    case USD:
     return "Hello World";

    case JPY:
      return String.valueOf(currency.getDBValue());
    default:
     return null;  //return means left the method. 
  }
}

  public static void main(String[] args) {
  //  Currency currency = "HKD";  XX
  // Currency currency = Weekday.MONDAY; XX
    Currency currency = Currency.HKD; //enum is the tyoe
    if (currency == Currency.USD){ //check address, 全局得一粒, == )
      System.out.println("it is" + currency.getDescription());
    } else if (currency == Currency.HKD){
      System.out.println("it is" + currency.getDescription()); //assume 未知數
    } else if (currency == Currency.JPY){
      System.out.println("it is " + currency.getDescription()); //assume 未知數
    }
      System.out.println(currency);
      //ENUM already override Object.toString()
      System.out.println(currency.toString()); //"HKD"

      //default instance methods provided by ENUM.class
      //1. name()
      System.out.println(currency.name());//"HKD"

      //2. values() > for-each loop 
      for (Currency c: Currency.values()){  //array
        System.out.println(c.getDescription());
      }
      System.out.println(Currency.values().length); //3 , prove array
      
      System.out.println(Currency.HKD.hashCode()); //868693306
      System.out.println(Currency.USD.hashCode());//1746572565

      System.out.println(Currency.JPY.equals(currency)); //F
      System.out.println(Currency.HKD.equals(currency)); //T
//Object行頭
      //find who is parents. someone help you overider, so you are not print out address, now is print out HKD..so Overide by some one
    
      System.out.println(currency.equals(Currency.HKD)); //<< ??!! easy make mistake  //not a good coding style
      System.out.println(currency!= null&& currency.equals(Currency.HKD)); //better
      // equals 係睇前面野先, 如果前面係null 就error


      String x = "abc";
      //NOT OK 
      if (x.equals("abc")){ //potentially null pointer exception
//if x is null, 咁null 就錯
      }

      //OK
      if ("abc".equals(x)){   //false or true
      }

      System.out.println(Currency.get(2));//toString(), Currency(description - US Dollar.DBvalue)
    
    

    //3. valueOf() > static method
    System.out.println(Currency.valueOf("HKD").name());  //"HKD" , "HKD" > Currency enum > name() > "HKD" Static class to call 
    System.out.println(Currency.valueOf("123")); //java.lang.IllegalArgumentException (not type safe)
  }
}
