import java.util.Scanner;

class Factorial
{
	public static void main(String asd[])
	{
		 
		Scanner sc = new Scanner(System.in);
     		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int x= sc.nextInt();
			int sum=0;
			while(x!=0)
			{
				int p=x/5;
				sum=sum+p;
				x=x/5;
			}
			
			System.out.println(sum);	
		}
		
	}	
}