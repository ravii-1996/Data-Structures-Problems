import java.util.Scanner;
public class Tram
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		int count=0;
		int k=0;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			temp=temp+y-x;
			if(temp>count)
			{
				if(temp>k)
				k=temp;
			}
			count=temp;

		}
		System.out.println(k);
		sc.close();
	}
}