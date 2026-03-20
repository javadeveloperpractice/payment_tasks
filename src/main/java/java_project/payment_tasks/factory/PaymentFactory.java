package java_project.payment_tasks.factory;

import java_project.payment_tasks.payment.CreditCardPayment;
import java_project.payment_tasks.payment.CryptoPayment;
import java_project.payment_tasks.payment.PayPalPayment;
import java_project.payment_tasks.payment.Payment;
import java_project.payment_tasks.transaction.PaymentTransaction;

public final class PaymentFactory {
	
	public static Payment createPayment(String accountId, PaymentTransaction transaction) {
		
		if(transaction.getPaymentType().equals("CREDIT_CARD")) {
			return new CreditCardPayment(accountId, transaction);
		} else if(transaction.getPaymentType().equals("PAYPAL_TRANSFER")) {
			return new PayPalPayment(accountId, transaction);
		} else if(transaction.getPaymentType().equals("CRYPTO_TRANSFER")) {
			return new CryptoPayment(accountId, transaction);
		} else {
			throw new IllegalArgumentException("Unsupported payment type: ");
		}
	}
	
}
