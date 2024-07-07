//package com.example;

public class Exception1 {

	public static void main(String[] args) {
	  divide(10, 0);

	}
	public static void divide(int num,int divisor) {
		try {
		double res=num/divisor;
		System.out.println( res);
		}catch(Exception e) {
			System.out.println("we cannot divide by zero.Please enter value other than zero");
		}finally {
			System.out.println("cleaning up the code");
		}
		
	}
}
