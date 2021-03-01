import java.util.Scanner;
class InputTest
{
	public static void main(String as[])
	{
		Scanner sc = new Scanner(System.in);
     		int n = sc.nextInt();
		int k = sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			int x = sc.nextInt();
			if(x%k==0)
			{
				count++;
			}
				
		}
		System.out.println(count);
	}	
}