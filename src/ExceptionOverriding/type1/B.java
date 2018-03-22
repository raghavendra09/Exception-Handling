package ExceptionOverriding.type1;

import java.io.IOException;

public class B extends A {
	public void m1() throws IOException {
		//if parent class don't have exception child class cannot declare checked exception
		System.out.println("Child Class m1 method");
	}
}