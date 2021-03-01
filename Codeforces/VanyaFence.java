import java.io.*;
import java.util.Scanner;
public class VanyaFence
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			if(x>h)
			{
				count=count+2;
			}
			else
			{
				count++;
			}
		}
		System.out.println(count);

	}
}