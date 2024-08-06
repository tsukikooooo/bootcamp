import java.util.LinkedList;
import java.util.List;

public class Bank {
  public List<Account> accounts;

  public Bank(){
    this.accounts = new LinkedList<>();
  }
  public void add(Account account){
    accounts.add(account);
  }
  
  public static class Account{ //寄生...唔面用bank  call方式不同  // private?
    public static int number = 0 ;
    private int acctNo;
    
    public Account(){
      this.acctNo =  ++number;
    }
  }


  public static void main(String[] args) {
    Bank bank
  }
}

