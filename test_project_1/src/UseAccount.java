import static java.lang.System.out;

public class UseAccount {
  public static void main(String[] args) {
	Account myAccount = new Account();
	Account yourAccount = new Account();
	
	myAccount.name = "Andrew Larsen";
	myAccount.address = "530 Graystone Dr";
	myAccount.balance = 24.02;
	
	yourAccount.name = "Jane Q Public";
	yourAccount.address = "111 Consumer St";
	yourAccount.balance = 55.63;
	
	myAccount.display();
	System.out.print(" plus $");
	out.print(myAccount.getInterest(5.00));
	out.println(" interest ");
	
	yourAccount.display();
	
	double yourInterestRate = 7.00;
	out.print(" plus $");
	double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
	out.print(yourInterestAmount);
	out.println(" interest ");
	
}
}
