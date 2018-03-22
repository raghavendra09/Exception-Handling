package ThrowKey;

public class ThrowSample {
	public void vote(int age){

	if(age<18) {
		throw new ArithmeticException("You are not eligible");//throwing to jvm for handling the exception
	}
	else {
		System.out.println("You are Eligible");
	}
}
}
