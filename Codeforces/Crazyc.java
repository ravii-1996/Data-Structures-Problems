import java.util.Scanner;
public class Crazyc
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int[] arr=new int[n];
		int count=1,k;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(i>0)
			{
				k=arr[i]-arr[i-1];
				if(k<=c)
				{
					count++;
				}
				else
					count=1;
			}
		}
		System.out.println(count);
		
		sc.close();
	}
}