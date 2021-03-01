import java.io.*;
import java.util.Scanner;
class VanyaCube
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,sum=0,count=0;
		while(sum<=n)
		{
			sum=sum+(i*(i+1))/2;
			i++;
			if(sum<=n)
				count++;
		}
		System.out.println(count);
	}
}