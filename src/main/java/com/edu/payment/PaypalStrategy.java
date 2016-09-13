package com.edu.payment;

public class PaypalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void makePayment(float amount, String member) {
		System.out.println("amount $" +amount+ " payed using paypal. \nThank you for your payment");
	}
	/*	float creditbackAmt = 150 - amount;
		if(member.equalsIgnoreCase("passenger")){
		System.out.println(" fare $" + amount + ". amount paid using paypal. $"+creditbackAmt+" has been credited back to your account."
				+ "\n Thank you for your payment");
		}else if(member.equalsIgnoreCase("driver")){
			System.out.println("Amount $" +amount+ " is paid using paypal. \nThank you for your payment");
		}
	}*/
}
