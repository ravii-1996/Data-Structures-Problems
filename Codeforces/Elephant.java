import java.util.Scanner;
public class Elephant
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int x=0;
		if(k%5==0)
		{
			x=(k/5);
			System.out.println(x);
		}
		else
		{
			x=(k/5)+1;
			System.out.println(x);
		}
		
		sc.close();
	}
}