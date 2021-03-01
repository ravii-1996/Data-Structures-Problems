import java.util.Scanner;
public class Magnet
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		String str="";
		int count=0;
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			String s=sc.nextLine();
			if(str!=s)
			{
				count++;
			}
			str=s;
		}


			System.out.println(count);
	
		
		sc.close();
	}
}