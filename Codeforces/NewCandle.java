import java.io.*;
import java.util.Scanner;
public class NewCandle
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println((a*b-1)/(b-1));
	}
}