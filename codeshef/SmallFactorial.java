import java.util.Scanner;

public class SmallFactorial
{
	public static void main(String asd[])
	{
		 
		Scanner sc = new Scanner(System.in);
     		int n = sc.nextInt();
		long [] array=new long [100];
		for(int i=0;i<n;i++)
		{
			int x = sc.nextInt();
			long fact=1;
			for(int j=x;j>=1;j--)
			{
				fact=fact*j;
			}
			array[i]=fact;
			
		}
		for(int k=0;k<n;k++)
		{
		System.out.println(array[k]);
		}
	}	
}