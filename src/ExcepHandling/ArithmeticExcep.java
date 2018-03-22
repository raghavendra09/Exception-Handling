package ExcepHandling;
public class ArithmeticExcep {
	public static void main(String args[]) {
try {
	int a=50/0;
}
catch(ArithmeticException e){
	System.out.println(e);
	System.out.println("Exception is Handled");
}
System.out.println("Rest of the code is Executed");
}
}
