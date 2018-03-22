package excepPropagation;

public class Checked {
	void m1() {
		throw new InterruptedException("Exception Occured");
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
		catch(Exception ae) {
			System.out.println("Exception cannot handle anywhere in the chain of checked exception type!");
		}
	}
	public static void main(String[] args) {
Checked c=new Checked();
c.m4();
	}
}