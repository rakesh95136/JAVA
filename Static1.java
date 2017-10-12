package my.rakesh.com;

class A
{
	static int y = 8;
}


class B extends A
{
	static int y = 100;

}


public class Static1
{

	public static void main(String[] args)
	{
		
		B obj = new B();
		//obj.y = 9;
		System.out.println(obj.y);

	}


}