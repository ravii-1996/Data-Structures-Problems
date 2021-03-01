import java.util.Scanner;
public class NextRound
{
	public static void main(String asd[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int temp=0;
		int[] p =new  int[100];
		for(int i=0;i<n;i++)
		{
			p[i]=sc.nextInt();
			if(i==k-1)
			{
				 temp=p[i];
			}

		}
		int count=0;
		for(int j=0;j<n;j++)
		{
			if(temp!=0)
			{
				if(p[j]>=temp)
				{
					count++;
					
				}	
			}
			else
			{
				if(p[j]>temp)
				{
					count++;
				}
			}
			
		}

		System.out.println(count);
		
	}
}