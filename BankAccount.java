public class BankAccount {
	private double balance;
	private int accountID;
	private String password;
	public BankAccount(double startBalance, int startAccountID, String startPassword) {
		balance = startBalance;
		accountID = startAccountID;
		password = startPassword;
	}
	public int getAccountID() {
		return accountID;
	}
	public double getBalance() {
		return balance;
	}
	public void setPassword(String newPassword) {
		password = newPassword;
	}
	public String toString() {
		String result = getAccountID() +"   "+ getBalance();
		return result;
	}
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean withdraw(double amount) {
		if (amount < balance) {
			balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean transferTo(BankAccount other, double amount, String password) {
		if (this.password.equals(password)) {
			return (this.withdraw(amount) && other.deposit(amount));
		}
		else {
			return false;
		}
	}
}
