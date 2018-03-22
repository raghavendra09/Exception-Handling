package ThrowKey;

public class ThrowCustomOperation {
	//String a="Anudeep";
	String a="Anudeep Challa";
	int S=a.length();
	public void check() {
	try {
		if(S>10)
		{
			throw new ThrowCustom("Characters are above the limit(more than 10 charcaters) "+a);
		}
		else {
			 System.out.println("You are ok! "+a);
		}
	}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		
	}
}
}