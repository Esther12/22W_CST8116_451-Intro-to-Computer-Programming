public class bankAcount {
  private double balance = 2.34;
  int accountNumber = 12342145;
  public double getBalance() {// Accessor method
    return balance;
  }
  public void setBalance(double balance) {
    this.balance += balance;
  }
}
