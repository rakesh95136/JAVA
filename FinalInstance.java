package my.rakesh.com;

class A
{
	
	int aa;
	int bb;
        int a = 9;
	
        {
		int x = 10;
		bb = x;
	}
	A(int ss)
	{
		aa = ss;
	}


}


public class FinalInstance
{

	public static void main(String[] args)
	{
		A a = new A(100);
		
		System.out.println(a.bb);

	}

}