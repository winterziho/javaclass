package HW;

public class Quiz10 {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.deposit(500.0);
		account.withdraw(200.0);
		
		System.out.println("The balance of the account is " + account.getBalance());
	}

}

class BankAccount {
	
		private double balance;
			
		BankAccount(){
			this.balance = 0.0;
		}
		
		void deposit(double amount) {
				balance += amount;
				System.out.println("Deposited: " + amount);
		} 
		
		void withdraw(double amount) {
				balance -= amount;
				System.out.println("Withdrawn: " + amount);
		}
		
		public double getBalance() {
			return balance;
		}
}