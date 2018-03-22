package ThrowKey;

public class ThrowChecked {
	public void vote(){
	try {
		System.out.println("Before");		
		Thread.sleep(1000);
		System.out.println("After Some time");
		throw new InterruptedException("Interupted For One Second");
	} catch (InterruptedException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}
}