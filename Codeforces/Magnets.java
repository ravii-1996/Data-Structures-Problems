import java.io.*;
import java.util.*;
public class Magnets
{
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0;
	String str="";
	for(int i=0;i<=n;i++)
	{
		String s=sc.nextLine();

		if(i>0 && !s.equals(str))
			count++;
		str=s;
	}
	System.out.println(count);
}

}
