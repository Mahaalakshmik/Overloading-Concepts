package com.oops.concepts;

public class Class_Child extends Class_Parent {

@Override
public void printing() {
	
	super.printing();
}

	public static void main(String[] args) {

		Class_Child cc = new Class_Child();
		cc.printing();
		
	}
}
