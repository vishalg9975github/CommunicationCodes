package com.communication.codes;

public class ExceptionQuestion1 {

	public static void main(String[] args) {

		try {
			System.out.println("1");
			int i = 10 / 0;
		} catch (NullPointerException e) {
			System.out.println("2");
			try {
				System.out.println("3");
				int i = 20 / 0;
			} catch (ArithmeticException ae) {// changed the object name from e to ae
				System.out.println("4"); // because the same object name will give error
				e.printStackTrace();
			}
		}
	}
}
