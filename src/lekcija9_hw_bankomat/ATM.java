package lekcija9_hw_bankomat;

import java.util.ArrayList;

public class ATM {

	private static ArrayList<BankAccount> accounts;
	

	public ATM() {

	}

	public ATM(BankAccount newAccount) {
		accounts = new ArrayList<BankAccount>();

	}

	public static void addAccount(BankAccount newAccount) {
		accounts.add(newAccount); // calls "add" method of ArrayList class

	}

	public static ArrayList<BankAccount> getAccounts() {
		return accounts;
	}

}
