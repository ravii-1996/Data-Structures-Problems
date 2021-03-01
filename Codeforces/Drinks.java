import java.util.Scanner;
public class Drinks
{
	public static void main(String as[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double temp=0;
		for(int i=1;i<=n;i++)
		{
			double x=sc.nextDouble();
			temp=(x/100)+temp;
		}
		System.out.println(temp/n*100);
		sc.close();
	}
}