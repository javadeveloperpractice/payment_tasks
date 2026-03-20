package java_project.payment_tasks.payment;

import java_project.payment_tasks.hierarchy.BasePayment;
import java_project.payment_tasks.transaction.PaymentTransaction;

public class CryptoPayment extends BasePayment implements Payment {

	public CryptoPayment(String accountId, PaymentTransaction paymentTransaction) {
		super(accountId, paymentTransaction);
	}

	@Override
	public double processPayment(double amount) {
		System.out.println("Processing CRYPTO TRANSFER payment... cash amount: " + amount);
		amount = Payment.validateAmount(amount);
		return 3; 
	}

}
