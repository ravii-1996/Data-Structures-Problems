import java.util.Scanner;
public class YoungPhysicist
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0,count=0,flag=0;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			temp=temp+x;
			flag=flag+y;
			count=count+z;
		}
		if(flag==0&&temp==0&&count==0)
			System.out.println("YES");
		else
			System.out.println("NO");

		sc.close();
	}
}