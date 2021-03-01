import java.util.Scanner;
public class George
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
			{
				int x=sc.nextInt();
				int y=sc.nextInt();
				int z=y-x;
				if(z>1)
				{
					count++;
				}
			}
		System.out.println(count);
		sc.close();
	}
}