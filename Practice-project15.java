package com;
class MyException extends Exception{
	public MyException() {
		
	}
	public MyException(String msg) {
		super(msg);
	}
}

public class ThrowExample {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		try {
			if(a>b) {
				//throw new Exception(); //super class predefined
				//throw new Exception("a>b); //super class with custom message predefined with custom message
				//throw new ArithmeticException(); //arithmeticException
				//throw new ArithmeticException("a>b); //pre-defined exception with custom message 
				//throw new MyException(); //custom exception 
				throw new MyException("a>b");  //custom exception with custom message
			}else {
				System.out.println("No");
			}
		}catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}

//Throws keyword

public class ThrowsExample {
	static void display1()throws Exception{
		//try{
		int a=10/0;
		//throws new Exception();
		//}catch(Exception e){}
		System.out.println("display1 method");
	}
	static void display2()throws Exception{
		//try{
		display1();
		//}catch(Exception e){}
		System.out.println("display2 method");
	}

	public static void main(String[] args) {
		display2();
		System.out.println("Main method");

	}

}

//finally keyword

public class TryWithFinally {

	public static void main(String[] args) {
	try {
		int res=10/0;
		System.out.println("No Exception");
	} finally {
		System.out.println("finally block");
	}
	System.out.println("Normal statement");
	}

}
