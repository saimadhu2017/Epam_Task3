package epam.com.epamTask3;

public class Multiplication extends Substraction{
	public static int mul(int a[],int t)
	{
		int mul=1;
		for(int i=0;i<t;i++)
		{
			mul=mul*a[i];
		}
		return mul;
	}


}
