import java.util.Scanner;
public class Team
{
	public static void main(String asd[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<3;j++)
			{
				int x=sc.nextInt();
				if(x==1)
					count++;
			}
			if(count>1)
			{
				temp++;
			}
		}

		System.out.println(temp);
		sc.close();
	}
}