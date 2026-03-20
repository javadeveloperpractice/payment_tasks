package java_project.payment_tasks.transaction;

import java.util.Objects;

public final class PaymentTransaction {

	private final String id;
	private final double amount;
	private final long timestamp;
	private final String paymentType;

	public String getId() {
		return id;
	}

	public double getAmount() {
		return amount;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public PaymentTransaction(String id, double amount, long timestamp, String paymentType) {
		this.id = Objects.requireNonNull(id, "id cannot be null");
		this.timestamp = Objects.requireNonNull(timestamp, "timestamp cannot be null");
		this.paymentType = Objects.requireNonNull(paymentType, "paymentType cannot be null");

		if (amount <= 0) {
			throw new IllegalArgumentException("amount must be greater than zero");
		}

		this.amount = amount;
	}

	@Override
	public String toString() {
		return "PaymentTransaction [id=" + id + ", amount=" + amount + ", timestamp=" + timestamp + ", paymentType="
				+ paymentType + "]";
	}

}
