package com.oops.concepts;

public class Abstract_Bank2 extends Abstract_Bank1 {

	@Override
	public void jewelLoan() {
		System.out.println("jewel loan is 15%");

	}

	public static void main(String[] args) {
		
		Abstract_Bank2 ab = new Abstract_Bank2();
		ab.carLoan();
		ab.jewelLoan();
	}

}
