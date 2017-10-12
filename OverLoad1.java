package my.rakesh.com;

//In this example all fun1() are kept in the parent class
//Same way you can keep all function in the child class
//Overload work it doen't matter where will be the functions kept.

class A
{
	public void fun1(int a)
	{
		System.out.println("One Argument");

	}


	public void fun1(int b, int c)
	{

		System.out.println("Two Argument");
	}

}

class B extends A
{


}


public class OverLoad1
{
	public static void main(String[] args)
	{
		B b = new B();
		b.fun1(6);
		b.fun1(3,4);
	}

}


