public class Driver{
	public static void main(String[]args){
		BankAccount a = new BankAccount(1000000.1, 210956108, "weichang1");
		System.out.println(a.getAccountID() + " has " + a.getBalance() + " dollars");
		//please print "210956108 has 1000000.1 dollars
		if(a.withdraw(1000) ){
            		System.out.println("Withdrawal success!");
       		}else{
            		System.out.println("Withdrawal failure");
       		}
		if(a.deposit(-1000000) ){
            		System.out.println("Deposit success!");
       		}else{
            		System.out.println("Deposit failure");
       		}
		if(a.deposit(1000000) ){
            		System.out.println("Deposit success!");
       		}else{
            		System.out.println("Deposit failure");
       		}
		System.out.println(a.getAccountID() + " has " + a.getBalance() + " dollars");
	}
}
