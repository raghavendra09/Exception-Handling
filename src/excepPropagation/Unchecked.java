package excepPropagation;

public class Unchecked {
	void m1() {
		int a=10/0;
	}
	void m2() {
		m1();
	}
	void m3() {
		m2();
	}
	void m4() {
		try {
			m3();
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Exception can handle anywhere in the chain of unchecked exception type!");
		}
	}
public static void main(String args[]) {
	Unchecked u=new Unchecked();
	u.m4();
}
}

