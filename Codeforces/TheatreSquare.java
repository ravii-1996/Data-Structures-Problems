import java.util.Scanner;
public class TheatreSquare
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long m=sc.nextInt();
		long a=sc.nextInt();
		long net=((n+a-1)/a)*((m+a-1)/a);
		System.out.println(net);
		sc.close();
	}
}