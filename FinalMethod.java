package my.rakesh.com;


/*

You can not override Final method


*/

class A
{
	public final void fun1(int a)   //Since it is final function
	{
		System.out.println("A");
	}

}


class B extends A
{
	public void fun1(int a)   //Since Parent function is final, you can not override the fun1() it will give you error.
	{
		System.out.println("B");  
	}


}

public class FinalMethod
{

	public static void main(String[] args)
	{
		B b = new B();
		b.fun1(9);

	}

}