package ExcepHandling;
public class ArrayIndexOutOfBoundExcep {
	public static void main(String args[]) {
try {
int a[]=new int[5];
a[10]=30;
}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println(e);
	System.out.println("Exception is Handled");
}
System.out.println("Rest of the code is Executed");
}
}
