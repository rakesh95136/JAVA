package my.rakesh.com;

class A
{
	int a = 3;
	public void fun1()
	{
		System.out.println("A");
	}
}


class B extends A
{
	int a = 33;
	int b = 44;
	
	public void fun1()
	{
		System.out.println("B");
		//System.out.println(this.fun1());
		//System.out.println(super.fun1());
		
		
	}

	public void fun2()
	{
		int a = 333;
		System.out.println(a);  // This is local variable here in this function
		System.out.println(this.a); // This is the instance variable of this class 
		System.out.println(super.a); // This is the super variable of parent class

		this.fun1();  // It will call Objects functions
		super.fun1(); // It will call Parent function

	}

}


public class Super1
{

	public static void main(String[] args)
	{

		B obj = new B();
		obj.fun2();
		//System.out.println("Test");
		//obj.fun1();


	}


}