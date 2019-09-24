package testpack;

public class MethodBalance {
	public static void main(String[] args) {
		System.out.println(checkCurrentBalance(23, 2));
		System.out.println(checkCurrentBalance(355656, 23454));

		
		
		MethodBalance mb = new MethodBalance();
		mb.showMyName();
	}

	public static double checkCurrentBalance(int deposit, int withdraw) { // you have just ONE method
		double balance = deposit - withdraw;
		return balance;
	}

	public void showMyName() {
		System.out.println("Santosh!");
	}

}