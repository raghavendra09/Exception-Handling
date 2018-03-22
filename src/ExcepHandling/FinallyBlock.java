package ExcepHandling;
public class FinallyBlock {
public static void main(String args[]) {
	try {
		int data1=25/5;
		int data2=25/0;
	}
	finally{
		System.out.println("Finally Block is Always Executed Irrespective of Exception");
	}
	System.out.println("Rest of the code is executed!");//It is not executed because it is not placed in finally block.
}
}