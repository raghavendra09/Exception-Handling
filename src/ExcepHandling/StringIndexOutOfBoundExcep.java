package ExcepHandling;

public class StringIndexOutOfBoundExcep {

	public static void main(String[] args) {
		try {
		String s="anudeep";
		char ch=s.charAt(7);
		}
		catch(StringIndexOutOfBoundsException a) {
			System.out.println("Exception Handled!");
			System.out.println(a);
		}
	}
}