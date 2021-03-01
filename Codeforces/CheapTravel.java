import java.util.Scanner;
public class CheapTravel
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();

		int x=n/m;
		int y=n%m;
	
		int z=(x*b)+(y*a);			
		int z1=(x+1)*b;
		int z2=n*a;
		if(z<=z1&&z<=z2)
			System.out.print(z);
		else if(z1<=z&&z1<=z2)
			System.out.print(z1);
		else if(z2<=z1&&z2<=z)
			System.out.print(z2);


		sc.close();
	}
}