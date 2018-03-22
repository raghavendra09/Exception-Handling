package ThrowsKey;

public class TestingCustomException {
public void Test(int a,int b) throws CustomException {
int c;
c=a+b;

if(c<=1) {
	throw new CustomException("Please Enter Greater Values!");
}
else {
	System.out.println(c);
}
}
}