package ExcepHandling;

public class ThrowKeyword {
	static void Validate(int age) {
		if(age<18) {
			throw new ArithmeticException("You are not supposed vote!");
		}
		else {
			System.out.println("You are eligible to vote!");
		}
	}
	public static void main(String args[]) {
		Validate(1);
		//Validate(21);
		System.out.println("Welcome!");
	}

}
