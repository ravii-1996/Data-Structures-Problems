import java.io.*;
import java.util.Scanner;
public class AntonLetters
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(char ch='a';ch<='z';ch++)
		{
			if(s.contains(String.valueOf(ch)))
				count++;
		}
		System.out.println(count);
	}
}