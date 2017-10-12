package my.rakesh.com;
class Box
{
	private int l,b,h;
        int u = 100;
	public void setDimensions(int l, int b, int h)
	{
		this.l = l;
		this.b = b;
		this.h = h;	
	}


	public void Dummy()
	{
		System.out.println(this.u);
		this.setDimensions(2,3,4);
	}
	
}


public class This1
{
	public static void main(String[] args)
	{
		Box obj = new Box();
		obj.setDimensions(2,3,4);
	}
}