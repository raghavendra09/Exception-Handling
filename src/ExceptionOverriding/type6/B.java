package ExceptionOverriding.type6;

import java.io.IOException;

public class B extends A {
	public void m1() throws Exception{
		/*if parent class have an exception child class Cannot declare parent type of exception
		For Example, in this class we have declare arithmetic exception in parent class
		and exception in child class. Exception is parent to Arithmetic Exception 
		so u cannot declare parent exception in child class when we are declaring child class
		exception in parent class*/
		System.out.println("Child Class m1 method");
	}
}