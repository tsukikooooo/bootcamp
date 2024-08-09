import java.util.LinkedList;
import java.util.List;

public class Bank {
  private List <Account> accounts;
  private String address;
  
  public Bank(){
    this.accounts = new LinkedList<>();
  }
  
  public void add(Account account){
    accounts.add(account);
  }

  private static void creditAccount(double amount){
    new Account().credit(amount);
  } 

    //public Account createAccount(){
    //return new Account(); //only need to call this...  //can Account. 去新產其他野

    //can try private to write 
//     private static Account creditAccount(double amount)
//  {return new Account();
//     new account().credit(amount);
//  }
  
  //control access , 強調 bank..入面, 或者講明得佢..但public...can bank.sth()
  public static class Account{ //寄生...唔面用bank  call方式不同  // private?  
    //private : 用public 去報露
    public static int number = 0 ;
    private int acctNo;
    private double balance;
    
    public Account(){
      this.acctNo = ++number;
    }

    public int getAccNo(){
      return this.acctNo;
    }
    public void credit(double amount){
      this.balance += amount;
    }

      public void print(){
        //this.address; //cannot call address...coz cannot access outer class instance variable in static nested class
        // coz Account and Bank are in Parent relationship
        //heap 唔成立
      }
    }
  }

