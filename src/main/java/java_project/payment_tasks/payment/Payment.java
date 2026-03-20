package java_project.payment_tasks.payment;

public interface Payment {

	abstract double processPayment(double amount);

	default void printReceipt() {
		System.out.println("Receipt: Payment processed successfully");
	}

	static double validateAmount(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount must be greater than zero");
		} else {
			System.out.println("Amount is valid: " + amount);
		}	
		return amount;
	}

}
