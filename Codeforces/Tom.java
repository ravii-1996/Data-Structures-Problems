import java.util.Scanner;
class Test
{
	public long fact(long x)
	{
		long pro=1;
		for(long j=1;j<=x;j++)
		{
			pro=pro*j;
		}
		return pro;
	}
}
public class Tom
{
	public static void main(String asd[])
	{
		Test ob= new Test();
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long k=sc.nextInt();
		long i=0;
		long temp=0;
		while(i<=k)
		{
			temp=temp+(ob.fact(n)/(ob.fact(i)*ob.fact(n-i)));
			i=i+2;
		}
		System.out.println(temp);

		sc.close();
	}
}