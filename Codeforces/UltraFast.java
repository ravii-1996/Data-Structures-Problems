import java.io.*;
import java.util.*;
public class UltraFast
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String str="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				str=str+"0";
			}
			else
				str=str+"1";
		}
		System.out.println(str);
		


	}
}