package com.te.basics.inheritance;

//Base Class
class Payment {
	public void processPayment() {
		System.out.println("Processing payment...");
	}
}

//Subclasses
class CreditCardPayment extends Payment {
	public void validateCard() {
		System.out.println("Validating credit card details...");
	}
}

class PayPalPayment extends Payment {
	public void loginToPayPal() {
		System.out.println("Logging into PayPal account...");
	}
}

public class PaymentSystem {
	public static void main(String[] args) {
		// Upcasting
		Payment payment = new CreditCardPayment();
		payment.processPayment(); // Polymorphic behavior

		// Downcasting
		if (payment instanceof CreditCardPayment) {
			CreditCardPayment ccPayment = (CreditCardPayment) payment;
			ccPayment.validateCard(); // Access specific method
		}

		// Using PayPal
		Payment paypalPayment = new PayPalPayment();
		if (paypalPayment instanceof PayPalPayment) {
			PayPalPayment ppPayment = (PayPalPayment) paypalPayment;
			ppPayment.loginToPayPal();
		}
	}
}
