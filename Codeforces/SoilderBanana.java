import java.util.Scanner;
public class SoilderBanana
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int w=sc.nextInt();
		int temp=0;
		for(int i=1;i<=w;i++)
			{
				temp=temp+i*k;
			}
		if(temp>n)
			System.out.println(temp-n);
		else
			System.out.println("0");
		sc.close();
	}
}