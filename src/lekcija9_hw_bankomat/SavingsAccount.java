package lekcija9_hw_bankomat;

public class SavingsAccount extends BankAccount {

	private double interestRate;

	public SavingsAccount(String accNumber, String accName, double balance, double interestRate) {
//		pozivamo konstruktor super BankAccount klase(accNumber, accName)
		super(accNumber, accName, balance);
		this.interestRate = interestRate;
	}


	public boolean	svngdeposit(double amount) {
		if (amount > 0) {
			balance = getBalance() + amount;
			double interest = getBalance() * interestRate / 100;
			balance += interest;
			System.out.println("******************************************");
			System.out.println("You have successfully deposited: " + amount + "$" + "\nYour interest is: " + interest
					+ "$" + "\nCurrent savings account balance: " + getBalance() + "$");
			System.out.println("******************************************");
			return true;
		} else {
			return false;
		}

	}

}
