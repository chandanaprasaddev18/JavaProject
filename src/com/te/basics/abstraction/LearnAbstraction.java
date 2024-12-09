package com.te.basics.abstraction;

import java.util.Scanner;

interface Payment {
	public abstract void validateUser();

	public abstract void processPayment();

}

class PhonePe implements Payment {

	@Override
	public void validateUser() {
		System.out.println("validating user's UPI id through Phone pe");
	}

	@Override
	public void processPayment() {
		System.out.println("processing payment through Phone-pe");
	}

}

class GooglePay implements Payment {

	@Override
	public void validateUser() {
		System.out.println("validating user's UPI id through Google-pay");
	}

	@Override
	public void processPayment() {
		System.out.println("processing payment through Google-pay");
	}

}

class Paytm implements Payment {

	@Override
	public void validateUser() {
		System.out.println("validating user's UPI id through Paytm");
	}

	@Override
	public void processPayment() {
		System.out.println("processing payment through Paytm");
	}

}

class DecidesPaymentProcess {
	public static Payment decidingPaymentProcess(String payThrough) {
		if (payThrough.equalsIgnoreCase("phonepe")) {
			return new PhonePe();
		} else if (payThrough.equalsIgnoreCase("googlepay")) {
			return new GooglePay();
		}
		return new Paytm();

	}
}

public class LearnAbstraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the application through which you need to process payment");
		String payThrough = sc.next();
		Payment paymentProcess = DecidesPaymentProcess.decidingPaymentProcess(payThrough);
		paymentProcess.validateUser();
		paymentProcess.processPayment();

	}
}
