package my.rakesh.com;

/*

There are three way to implement final keyword

1) Intilize in the bigning , int y = 0;
2) In the intilization box
3) In the constructor

*/


public class Final1
{
   
   int y; //This is instance variable, and by defalt the value of int is ZERO
   final int x = 9; //Now when you declare final keyword then default value of x becomes BLANK   

   //There are 3 ways you can assign value of final variable.

   //First
   final int s = 2;

   //Second way with the initizilation block
   
     {
        int r = 2;
	
	//System.out.println("Initilization Block : " +obj.r);
     }

   		
   //Constructor
    Final1()
	{
		int f = 100;
		//System.out.println("Constructor : " + f);
	}


	public static void main(String[] args)
	{
		Final1 obj = new Final1();

		//System.out.println("First  : " + obj.s);
		
		
		
	}

}



