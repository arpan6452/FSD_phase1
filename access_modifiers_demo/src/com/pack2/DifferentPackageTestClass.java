package com.pack2;

import com.pack1.MainClass;

public class DifferentPackageTestClass {
	public static void main(String[] args) {
		MainClass c = new MainClass();
		c.printPrivateField();		
		c.publicField = 898989;
		System.out.println("k = " + c.publicField);
	}
}
