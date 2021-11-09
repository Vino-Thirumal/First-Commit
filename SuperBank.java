
package javaInterface;

public class SuperBank implements Bank1 {
	
	public void SavingsAccount(String Name, String AccountNumber, double Balance) {
		
		System.out.println("Name: " + Name);
        System.out.println("Savings Account Number- " + AccountNumber);
        System.out.println("Savings Balance- "+ Balance);
	}
	
	public void CurrentAccount(String AccountNumber, double Balance) {
		
		System.out.println("Current Account Number- " + AccountNumber);
        System.out.println("Current Balance- "+ Balance);
	
	}
}
