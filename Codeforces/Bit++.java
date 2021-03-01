import java.util.Scanner;
public class Bit
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			String s=sc.nextLine();
			if(s.charAt(0)=='+'||s.charAt(2)=='+')
			{
				count++;
			}
			if(s.charAt(0)=='-'||s.charAt(2)=='-')
			{
				count--;
			}
		}
		System.out.println(count);
		sc.close();
	}
}