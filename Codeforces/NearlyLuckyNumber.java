import java.util.Scanner;
public class NearlyLuckyNumber
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int temp=0;
		for(int i=0;i<s.length();i++)
			{
				if('7'!=s.charAt(i)||'4'!=s.charAt(i))
					temp++;
			}
		if(temp>1)
			System.out.println("NO");
		else
			System.out.println("YES");

		sc.close();
	}
}