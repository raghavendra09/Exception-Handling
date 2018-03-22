package WithoutSuperCustomException;

public class TestCustomException {
public void Test(int a) throws WithoutSuper {
	
	if(a<=1)
	{
		throw new WithoutSuper(a);
	}
	else
	{
		System.out.println(a);
	}
}
}