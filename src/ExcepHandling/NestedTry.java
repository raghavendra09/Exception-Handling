package ExcepHandling;

public class NestedTry {
public static void main(String args[]) {
	try {
		//int c=20/0; //if exception is occured here then this relative catch block will execute.
		try {
			int a=30/0;
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception is handled here!");
			try {
				String a="Anudeep";
				int b=Integer.parseInt(a); //if it is not placed here then you will not get the next catch sop statement as output.
			}
			catch(NumberFormatException nfe) {
				System.out.println("We can also try and catch inside a catch!");
			}
		}
		
		try {
			int a[]=new int[5];
			a[5]=4;
		}
		catch(ArrayIndexOutOfBoundsException aoe) {
			System.out.println("Array Index Out of Bounds Exception is handled here!");
		}
		 
		System.out.println("other statement");
	}
	catch(Exception e) {
		System.out.println("Exception is handled here!");
	}
	finally{
		System.out.println("Irrespective of code this block will executed");
	}
	
	System.out.println("Rest of the code is executed");
}
}
