package ThrowsKey;

public class Client2 {
	public static void main(String[] args) {
		
		TestingCustomException tce=new TestingCustomException();
	try {
		tce.Test(1, 0);
	} catch (CustomException e) {
		e.printStackTrace();
	System.out.println(e.getMessage());
	}
	}	
/*		public static void main(String[] args) throws CustomException{
			TestingCustomException tce=new TestingCustomException();
			tce.Test(1, 0);
}*/
}