package WithoutSuperCustomException;

public class WithoutSuper extends Exception{
public WithoutSuper(int a) {
	System.out.println("You Have Entered "+a+" you have to enter above 1");
}
}
