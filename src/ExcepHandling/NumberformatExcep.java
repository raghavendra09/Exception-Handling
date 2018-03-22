package ExcepHandling;
public class NumberformatExcep {
	public static void main(String args[]) {
try {
	String s="abc";
	int i=Integer.parseInt(s);
}
catch(NumberFormatException e){
	System.out.println(e);
	System.out.println("Exception is Handled");
}
System.out.println("Rest of the code is Executed");
}
}
