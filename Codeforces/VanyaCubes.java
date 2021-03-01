import java.io.*;
import java.util.*;
public class VanyaCubes
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=0,count=0,x=0,n=0;
		for(int i=1;x<=a;i++)
		{
			temp=temp+i;
			x=x+temp;
			if(x<=a)
				count++;

		}
		System.out.println(count);

	}
}