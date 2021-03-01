import java.util.Scanner;
public class LongWord
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		for(int i=0;i<=n;i++)
		{
			String s=sc.nextLine();
			int l=s.length();
			if(l<=10)
			{
				System.out.println(s);
			}
			else 
				System.out.println(""+s.charAt(0)+(s.length()-2)+s.charAt(s.length()-1));
		}

		sc.close();
	}
}