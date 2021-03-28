package com.oops.concepts;

public class Overriding_Girl extends Overriding_Boy {
	
	@Override
	public void girl_Name() {
	
		super.girl_Name();
	System.out.println("Anamica");
	
	}
	public static void main(String[] args) {
		Overriding_Girl og = new Overriding_Girl();
		og.girl_Name();
	}

	
}
