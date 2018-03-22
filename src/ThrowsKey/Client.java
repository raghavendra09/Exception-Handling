package ThrowsKey;

public class Client {

	public static void main(String[] args) throws InterruptedException{
		ThrowsSample ts=new ThrowsSample();
			//try {
				ts.Test();
			/*} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
	}
}