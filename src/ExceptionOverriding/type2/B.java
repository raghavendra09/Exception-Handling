package ExceptionOverriding.type2;

import java.io.IOException;

public class B extends A {
	public void m1() throws ArithmeticException {
		//if parent class don't have exception child class can declare Unchecked exception
		System.out.println("Child Class m1 method");
	}
}