package com.oops.concepts;

public class Overloading_Concepts {

	public void loan() {
		System.out.println("Loan is 12%");

	}

	public void loan(int id) {
		System.out.println("Car loan is " + id);

	}

	public static void main(String[] args) {
		Overloading_Concepts oc = new Overloading_Concepts();
		oc.loan();
		oc.loan(15);

	}

}
