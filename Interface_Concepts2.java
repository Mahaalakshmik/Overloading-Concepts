package com.oops.concepts;

public class Interface_Concepts2 implements Interface_Concepts {

	@Override
	public void goldLoan() {
		System.out.println("gold loan is available");

	}

	@Override
	public void carLoan() {
		System.out.println("car loan is available");

	}

	public static void main(String[] args) {
		Interface_Concepts2 ic = new Interface_Concepts2();
		ic.carLoan();
		ic.goldLoan();
	}

}
