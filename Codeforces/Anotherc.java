import java.util.Scanner;

public class Anotherc
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] product=new long[n];
		for(int i=0;i<n;i++)
		{
			int x = in.nextInt();
			int y = in.nextInt();
			int p=Math.max(x,y);
			product[i]=p*p;
		}
		for(int j=0;j<n;j++)
		{
			System.out.println(product[j]);
		}

		
	}
}	