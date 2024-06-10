import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BankAccount {

  // attrubutes
  private LocalDateTime transaction;
  private int accountNumber;
  private double accountBalance;
  private double deposit;
  private double withdrawn;


  // Arugments Constructor
  public BankAccount(LocalDateTime transaction, int accountNumber,
      double accountBalance, double deposit, double withdrawn) {
    this.transaction = transaction;
    this.accountNumber = accountNumber;
    this.accountBalance = accountBalance;
    this.deposit = deposit;
    this.withdrawn = withdrawn;
  }

  // getter setter
  public void setTransaction(LocalDateTime transaction) {
    this.transaction = transaction;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public void setWithdrawn(double withdrawn) {
    this.withdrawn = withdrawn;
  }

  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }

  public LocalDateTime getTransaction() {
    return this.transaction;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public double getAccountBalance() {
    return this.accountBalance;
  }

  public double getWithdraw() {
    return this.withdrawn;
  }

  public double getDeposit() {
    return this.deposit;
  }

  // Attributes Persentation
  public double newBalance() {
    return BigDecimal.valueOf(this.accountBalance)
        .add(BigDecimal.valueOf(this.deposit))
        .subtract(BigDecimal.valueOf(this.withdrawn)).doubleValue();
  }

  // static method
  public static double calculateBalance(double accountBalance, double deposit,
      double withdrawn) {
    return BigDecimal.valueOf(accountBalance).add(BigDecimal.valueOf(deposit))
        .subtract(BigDecimal.valueOf(withdrawn)).doubleValue();
  }

  // toString()
  public String toString() {
    return "Bank Account: "//
        + accountNumber //
        + ", Date: " //
        + this.transaction//
        + ", Balance: " //
        + newBalance() + "";
  }

  public static void main(String[] args) {

    BankAccount a = new BankAccount(LocalDateTime.of(2024, 6, 9, 14, 18), 1001,
        20000, 1546.05, 0);
    System.out.println(a.newBalance()); // 21546.05
    System.out.println(a);
    a.setAccountBalance(50000);
    System.out.println(a); // 51546.05
    a.setDeposit(4000);
    System.out.println(a); // 54000.0

    System.out.println("Account number: " + a.getAccountNumber());

    double a1 = calculateBalance(40000, 1000, 2000);
    System.out.println("Balance: " + a1);



  }

}
