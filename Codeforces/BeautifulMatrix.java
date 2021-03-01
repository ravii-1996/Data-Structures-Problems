import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class BeautifulMatrix
{
	public static void main(String arg[])
	{
		int arr[][]=new int[5][5];
		Scanner sc=new Scanner(System.in);
		int c=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				arr[i][j]=sc.nextInt();
				if(arr[i][j]==1)
				{
					int a=Math.abs(2-i);
					int b=Math.abs(2-j);
					 c=a+b;
				}
			}
		}

		System.out.println(c);
	}
}