package java_project.payment_tasks;

import java_project.payment_tasks.factory.PaymentFactory;
import java_project.payment_tasks.payment.Payment;
import java_project.payment_tasks.transaction.PaymentTransaction;

public class Main {
	public static void main(String[] args) {
		
		PaymentTransaction tx = new PaymentTransaction("TX1", 100, System.currentTimeMillis(), "CRYPTO_TRANSFER");

        Payment payment = PaymentFactory.createPayment("USER1", tx);

        payment.processPayment(200);
        payment.printReceipt();

		
	}
}
