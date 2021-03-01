import java.util.Scanner;
public class FoxSnake
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int temp=1;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i%2!=0)
				{
					temp++;
					if(temp%2==0)
					{
						if(j<m)
						{
							System.out.print(".");
						}
						else
						{
							System.out.print("#");
						}
					}
					else
					{
						if(j==1)
						{

							System.out.print("#");
						}
						else
						{
							System.out.print(".");
						}
					}
					
				}	
				else
				{
					System.out.print("#");
				}

			}
			System.out.println("");
		}
		
		
		sc.close();
	}
}