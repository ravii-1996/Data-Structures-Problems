import java.util.Scanner;
public class LuckyDivision
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%7==0||n%4==0||n%47==0||n%74==0||n%77==0||n%44==0||n%777==0||n%444==0||n%774==0||n%477==0||n%747==0||n%744==0||n%447==0||n%474==0)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");

		sc.close();
	}
}