package java_project.payment_tasks.payment;

import java_project.payment_tasks.hierarchy.BasePayment;
import java_project.payment_tasks.transaction.PaymentTransaction;

public class CreditCardPayment extends BasePayment implements Payment {

	public CreditCardPayment(String accountId, PaymentTransaction paymentTransaction) {
		super(accountId, paymentTransaction);
	}

	@Override
	public double processPayment(double amount) {
		System.out.println("Processing CREDIT CARD payment... cash amount: " + amount);
		amount = Payment.validateAmount(amount);
		return 1;
	}

}
