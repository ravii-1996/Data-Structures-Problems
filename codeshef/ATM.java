import java.util.Scanner;
class ATM
{
	public static void main(String asd[])
	{
		Scanner sc = new Scanner(System.in);
     		int x = sc.nextInt();
		double y = sc.nextDouble();
		if((x%5==0)&&(x+0.5<=y))
		{
			double z=x+0.5;
			y=y-z;
			System.out.println(y);	
		}
		else
		{
			System.out.println(y);
		}
	}
}