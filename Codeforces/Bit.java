import java.util.Scanner;
public class Bit
{
	public static void main(String asd[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<=n;i++)
		{
			String s=sc.nextLine();
			for(int j=0;j<s.length();j++)
			{
				if(j==1)
				{
					if(s.charAt(j)=='+')
					{
						count++;
						
					}
					else
					{
						count--;
						
					}
				}

			}

		}
		System.out.println(count);
		sc.close();
	}
}