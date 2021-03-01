import java.util.Scanner;
public class GameWithStick
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=n*m;
		if(k!=2)
		{
			if(k%2==0)
			System.out.println("Malvika");
			else
			System.out.println("Akshat");	
		}
		else
			System.out.println("Akshat");
		
		sc.close();
	}
}