import java.io.*;
import java.util.*;
public class Pangram
{
	public static void main(String arg[])
	{
		Scanner z=new Scanner(System.in);
		z.nextInt();
		String x=z.next();
		int k=0;
		for(char ch='a';ch<='z';ch++)
		{
			if(x.toLowerCase().contains(String.valueOf(ch)))
				k++;
		}
		if(k==26)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
}
