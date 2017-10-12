package my.rakesh.com;
//There will be couple of examples, in this example 
// fun1(String s) is kept in the parent class & fun1(int a) kept in child class

class A
{
	public void fun1(String s)  //Here I'm passing String
	{
		System.out.println("A");
	}
}


class B extends A
{
	public void fun1(int a)
	{
		System.out.println("B");  //Here I'm passing Int
	}
}


public class OverLoad
{
	public static void main(String[] args)
	{
		B b = new B();
		b.fun1("Rakesh");  //It will call function A fun1
		b.fun1(4);	   //It will call function B fun1
	}

}
