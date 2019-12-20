package com.service.pack;

public class Calculator_Module {
	
	
	
	public int add(int a , int b) {
		System.out.println("Add Service Invoked");
		return a+b;
		
		
		
	}

	
	public int sub(int a ,int b) {
		System.out.println("Sub Service Invoked");
		return a-b;
		
	}
	
	
	public double multiper(double a,double b ) {
		System.out.println("Multiper Service Invoked");
		return a*b;
		
	}
	
	public double divide(double a , double b) {
		System.out.println("Division Service Invoked");
		return a/b;
		
	}
	
}
