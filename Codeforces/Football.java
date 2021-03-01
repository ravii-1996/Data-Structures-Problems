import java.util.Scanner;
public class Football
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		int temp=0;
		for(int i=0;i<s.length();i++)
		{
			char k=s.charAt(i);
			if(k=='1')
			{
				count=0;
				temp++;
				if(temp>=7)
					break;
			}
			else
			{
				temp=0;
				count++;
				if(count>=7)
					break;
			}
		}
		if(count>=7||temp>=7)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		sc.close();
	}
}