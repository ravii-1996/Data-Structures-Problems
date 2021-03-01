import java.io.*;
import java.util.*;
public class Word
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int flag=0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(90>=(int)s.charAt(i) && 65<=(int)s.charAt(i))
				flag++;
			else
				count++;
		}
		if(count>=flag)
			System.out.println(s.toLowerCase());
		else
			System.out.println(s.toUpperCase());
	}
}