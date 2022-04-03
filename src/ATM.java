public class ATM {
  public static void main(String[] args)
	{
      bankAcount myAccount = new bankAcount();
      //get the private variable by calling the get method
    	System.out.println(myAccount.getBalance()+" original");
      //update the private variable by calling the set method
      myAccount.setBalance(2.34);
    	System.out.println(myAccount.getBalance() + " updated");
	}
}
