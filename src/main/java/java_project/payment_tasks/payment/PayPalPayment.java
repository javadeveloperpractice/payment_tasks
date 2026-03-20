package java_project.payment_tasks.payment;

import java_project.payment_tasks.hierarchy.BasePayment;
import java_project.payment_tasks.transaction.PaymentTransaction;

public class PayPalPayment extends BasePayment implements Payment {

	public PayPalPayment(String accountId, PaymentTransaction paymentTransaction) {
		super(accountId, paymentTransaction);
	}

	@Override
	public double processPayment(double amount) {
		System.out.println("Processing PayPal TRANSFER payment... cash amount: " + amount);
		amount = Payment.validateAmount(amount);
		return 2;
	}

}
