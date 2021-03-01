import java.util.Scanner;
public class Watermelon
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n!=2)
		{
			if(n%2==0)
			{
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
		else
			System.out.println("NO");
		

		sc.close();
	}
}