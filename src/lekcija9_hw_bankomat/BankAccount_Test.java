package lekcija9_hw_bankomat;

public class BankAccount_Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		BankAccount eldar = new BankAccount("12341", "Eldar Bajric", 1000);
		BankAccount muzafer = new BankAccount("12342", "Muzafer Muzaferagic", 1000);
		BankAccount hilmo = new BankAccount("12343", "Hilmo Hilmic", 1000);
		BankAccount hamo = new BankAccount("12344", "Hamo Hamic", 1000);
		BankAccount ramo = new BankAccount("12345", "Ramo Ramic", 1000);
		BankAccount lejla = new BankAccount("12346", "Lejla Lelic", 1000);
		BankAccount lamija = new BankAccount("12347", "Lamija Lamic", 1000);
		

		
		ATM racun1 = new ATM(eldar);
		ATM racun2 = new ATM(muzafer);
		ATM racun3 = new ATM(hilmo);
		ATM racun4 = new ATM(hamo);
		ATM racun5 = new ATM(ramo);
		ATM racun6 = new ATM(lejla);
		ATM racun7 = new ATM(lamija);
		
		ATM.addAccount(eldar);
		ATM.addAccount(muzafer);
		ATM.addAccount(hilmo);
		ATM.addAccount(hamo);
		ATM.addAccount(ramo);
		ATM.addAccount(lejla);
		ATM.addAccount(lamija);
	
		eldar.showMenu();
	



//		*Show account  info
		System.out.println(eldar.toString());
		System.out.println("\n" + muzafer.toString());

		
		

		
	}

}
