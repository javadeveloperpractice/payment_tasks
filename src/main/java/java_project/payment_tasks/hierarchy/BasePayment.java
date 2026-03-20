package java_project.payment_tasks.hierarchy;

import java.util.Objects;

import java_project.payment_tasks.payment.Payment;
import java_project.payment_tasks.transaction.PaymentTransaction;

public abstract class BasePayment implements Payment {
	
	private String accountId;
	private PaymentTransaction paymentTransaction;

	public String getAccountId() {
		return accountId;
	}

	public PaymentTransaction getPaymentTransaction() {
		return paymentTransaction;
	}

	protected BasePayment(String accountId, PaymentTransaction paymentTransaction) {
        this.accountId = Objects.requireNonNull(accountId, "ID акаунту не може бути null");
        this.paymentTransaction = Objects.requireNonNull(paymentTransaction, "Транзакція не може бути null");
    }

}
