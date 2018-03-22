package ExceptionOverriding.type5;

import java.io.IOException;

public class B extends A {
	public void m1(){
		/*if parent class have an exception child class can declare NO exception*/
		System.out.println("Child Class m1 method");
	}
}