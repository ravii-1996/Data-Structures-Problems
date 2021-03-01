import java.util.*;
import java.util.regex.*;
public class DoubleCola 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		String arr[]={"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
		while(a>5)
		{
			a=a-5;
			a=(a+1)/2;
		}
		System.out.println(arr[a-1]);
	}
}