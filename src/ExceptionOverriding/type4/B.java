package ExceptionOverriding.type4;

import java.io.IOException;

public class B extends A {
	public void m1() throws ArithmeticException {
		/*if parent class have an exception child class can declare Sub class exception 
		to the parent class Exception*/
		System.out.println("Child Class m1 method");
	}
}