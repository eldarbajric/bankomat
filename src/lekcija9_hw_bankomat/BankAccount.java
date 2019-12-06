package lekcija9_hw_bankomat;


import java.util.Scanner;

public class BankAccount extends ATM{

	private String accNumber;
	private String accName;
	protected double balance;
	

	BankAccount() {

	}

	public BankAccount(String accNumber, String accName, double balance) {

		this.accNumber = accNumber;
		this.accName = accName;
		this.balance = balance;
		
	}

	// *****GET & SET
	public String getAccNumber() {
		return accNumber;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("*********************************************");
			System.out.println("(" + getAccName() + ")");
			System.out.println(
					"You have successfully deposited: " + amount + "$" + "\nCurrent account balance: " + balance + "$");
			System.out.println("*********************************************" + "\n");
			return true;
		} else {
			return false;
		}
	}

	public boolean withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Not enough funds!");
			return false;
		} else {
			balance -= amount;
			System.out.println("You have successfully withdrawn: " + amount + "$" + "\nCurrent account balance: "
					+ balance + "$" + "\n");
			return true;
		}
	}
	
	public static void transfer() {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ID vaseg racuna: ");
		String sourceId = unos.next();
		System.out.println("Unesite ID primaoca: ");
		String targetId = unos.next();
		System.out.println("Unesite iznos transfera: ");
		double amount = unos.nextDouble();
		BankAccount source = null;
		BankAccount target = null;
		
		for (int i = 0; i < getAccounts().size(); i++) {
			BankAccount currentSrc = getAccounts().get(i); // get the account
			String tempSrcID = currentSrc.getAccNumber(); // get account number
			if (tempSrcID.equals(sourceId)) {
				currentSrc.balance -= amount;
				source = currentSrc;
				
			}
		}
		for (int j = 0; j < getAccounts().size(); j++) {
				BankAccount currentTrgt = getAccounts().get(j);
				String tempTrgtId = currentTrgt.getAccNumber();
				if (tempTrgtId.equals(targetId)) {
					currentTrgt.balance += amount;
					target = currentTrgt;
					
				}
			}
		System.out.println("-----------------------------");
		System.out.println(source.getAccName() + " Uspjesno ste izvrisli transkaciju na racun: " + target.getAccName());

	}
	

	public String toString() {
		return "Account number:" + this.accNumber + " |" + " Account name:" + this.accName + " |" + " Account balance: "
				+ this.balance;

	}

	void showMenu() {
		int option = -1;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Welcome to ATM :)");
		System.out.println("Your ID is: " + accNumber);
		System.out.println("0.- Stanje racuna.");
		System.out.println("1.- Make a deposit.");
		System.out.println("2.- Withdraw funds.");
		System.out.println("3.- Transfer funds.");
		System.out.println("4.- Exit.");

		while(option !=4) {
			System.out.println("********************************");
			System.out.println("Enter an option");
			System.out.println("********************************");
			option = sc.nextInt();
			

			switch (option) {
			case 0:
				System.out.println("-----------------------------");
				System.out.println(toString());
				System.out.println("-----------------------------");
				System.out.println("\n");
				break;

			case 1:
				System.out.println("-----------------------------");
				System.out.println("Enter the amount for deposit:");
				double depositAmount = sc.nextDouble();
				deposit(depositAmount);
				System.out.println("-----------------------------");
				break;

			case 2:
				System.out.println("-----------------------------");
				System.out.println("Enter the amount for withdrawl:");
				double withdrawAmount = sc.nextDouble();
				withdraw(withdrawAmount);
				System.out.println("-----------------------------");
				break;
			case 3:
				System.out.println("-----------------------------");
				transfer();
				System.out.println("-----------------------------");
				break;
				
			case 4:
				if(option == 4) {
					sc.close();
					break;
				}

			}

		} 
		
	}

}
