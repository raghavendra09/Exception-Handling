package WithoutSuperCustomException;

public class Client {

	public static void main(String[] args) {
		TestCustomException t=new TestCustomException();
		try {
			t.Test(1);
		} catch (WithoutSuper e) {
			e.printStackTrace();
		}
	}
}