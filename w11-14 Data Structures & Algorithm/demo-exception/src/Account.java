public class Account { //無可避免的情況

  private double balance;

  public Account(){
    this.balance = 0.0d;
  }

  public double getBalance(){
    return this.balance;
  }
  
  public void setBalance (double balance){
    this.balance = balance;
  }

  public void credit(double amount){
    this.balance += amount;
  }
//由boolean 轉做 void , 由 BusinessException 轉,InsufficientBalance (encapsulation)
  //public boolean debit(double amount)throws InsufficientBalance{//( BusinessException{ //throw check exception 
  public void debit(double amount) throws InsufficientBalance{ 
   if (this.balance < amount)
    //check exception , well define, 
    // throw new IllegalArgumentException();
      //throw new BusinessException(ErrorCode.INSUFF_BAL); //checked exception  用erum 可以唔俾人改, -99 & string  , 用家match 錯係0.
    throw new InsufficientBalance(); 

    this.balance -= amount;
  }

  public static void main(String[] args) throws InsufficientBalance { //throw -> JVM
    Account account = new Account();
    account.credit(100);
    try{
    account.debit(70);
    account.debit(31); //迫complie time //error 
  } catch (BusinessException e){ // 留意咁樣catch
    System.out.println("Message: " + e.getErrorCode() + "-" + e.getMessage());  //Can i epcapsulate?  係object 包裝原件..
//toSting : 
    System.out.println(e.codeWithMessgae()); // encap
   //error: -99-withdrawal amount > Account Balance
  } finally { //
   // ..s.get nalance():
    //如果 
    System.out.println("this is a section to run no matter there is exception or not");
  }
  System.out.println(account.getBalance()); //30.0

  //對syntax要熟悉
  //DS..> differcult dis
  //recapion 遲下學..h

 }
}
