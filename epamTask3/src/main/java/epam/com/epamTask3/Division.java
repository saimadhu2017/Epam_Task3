package epam.com.epamTask3;

public class Division extends Multiplication{
	public static void div(int num1,int num2)
	{
	    float f;
		try
		{
			f=num1/num2;
			System.out.println("division is "+f);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("try division with other number other than Zero");
		}
		
	}

}
