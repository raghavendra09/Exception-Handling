package ExcepHandling;
public class MultipleCatch {
	public static void main(String args[]) {
try {
	int a[]=new int[5];
	String s=null;
	System.out.println(s.length());
	a[5]=50/0;
}
catch(ArithmeticException e){
	System.out.println("task1 is completed");
}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("task2 is completed");
}
catch(NullPointerException npe){
	System.out.println("task0 is completed");//nullpointer exception is top exception
}
catch(Exception e){
	System.out.println("task3 is completed");
}
System.out.println("Rest of the code is Executed");
}
}
