package ExcepHandling;
public class NullpointerExcep {
	public static void main(String args[]) {
try {
String s=null;
System.out.println(s.length());
}
catch(NullPointerException e){
	System.out.println(e);
	System.out.println("Exception is Handled");
}
System.out.println("Rest of the code is Executed");
}
}
