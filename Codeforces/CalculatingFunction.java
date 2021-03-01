import java.util.Scanner;
public class CalculatingFunction
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x=0;
		if(n%2!=0)
		{
			long o=(n/2)+1;
			long e=n/2;
			 x=e*(e+1)-(o*o);
		}
		else
		{
			long o=n/2;
			long e=n/2;
			x=e*(e+1)-(o*o); 
		}
		
		System.out.println(x);
		
		sc.close();
	}
}