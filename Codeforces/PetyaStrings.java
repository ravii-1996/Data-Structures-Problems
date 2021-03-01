import java.util.Scanner;
public class HQ9
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.extLine();
		int temp=0;
		for(int i=0;i<=s.length();i++)
			{
				if('H'==s.charAt(i)||'Q'==s.charAt(i)||'9'==s.charAt(i)||'+'==s.charAt(i))
					temp++;
			}
		if(temp>0)
			System.out.println("Yes");
		else
			System.out.println("NO");

		sc.close();
	}
}