package com.edu.payment;

import java.sql.Date;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private double cardNumber;
	private int cvv;
	private Date dateOfExpiry;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(double cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public void makePayment(float amount, String member) {
		System.out.println("amount $" +amount+ " payed using credit card. \nThank you for your payment");
	}
		/*float creditbackAmt = 150 - amount;
		if (member.equalsIgnoreCase("passenger")) {
			System.out.println(" fare $" + amount + ". amount paid with credit card. $" + creditbackAmt
					+ " has been credited back to your account." + "\n Thank you for your payment");
		} else if (member.equalsIgnoreCase("driver")) {
			System.out.println("Amount $" + amount + " is paid using credit card. \nThank you for your payment");
		}
	}*/
}
