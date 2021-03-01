import java.util.Scanner;
public class Translation
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		StringBuilder str=new StringBuilder(s);
		s=str.reverse().toString();
		if(s.equals(s1))
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");

		sc.close();
	}
}