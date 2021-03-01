import java.io.*;
import java.util.*;
import java.lang.Math;
public class VasyaHipster
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(Math.min(a,b));
		System.out.println((Math.abs(a-b))/2);
	}
}