package my.rakesh.com;

//These two constructers are called constructure overloading.

public class Const1
{
	public Const1()
	{
		int l=10; int b=8; int h=4;
	}


	public Const1(int L, int B, int H)
	{
		int l = L;
		int b = B;
		int h = H;
	}

	public static void main(String[] args)
	{
		int l ;
		Const1 c1 = new Const1();   // new Const1() will create object. When object is created the very first this function is called
		System.out.println(l);
	}
}