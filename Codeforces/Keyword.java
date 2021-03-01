import java.io.*;
import java.util.*;
public class Keyword
{
	public static void main(String arg[])
	{
		Scanner z=new Scanner(System.in);
		String ch=z.nextLine();
		String s=z.nextLine();
		
		
		char arr[]={'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l',';','z','x','c','v','b','n','m',',','.','/'};

		if(ch.equals("R"))
		{
			for(int i=0;i<s.length();i++)
			{
				for(int j=0;j<30;j++)
				{
					if(arr[j]==s.charAt(i))
					{
						System.out.print(arr[j-1]);
					
					}
				}
				
			}
			System.out.println("");
		}
		else
		{
			for(int i=0;i<s.length();i++)
			{
				for(int j=0;j<30;j++)
				{
					if(arr[j]==s.charAt(i))
					{
						System.out.print(arr[j+1]);
					}
				}
				
			}
			System.out.println("");
		}


	}
}