import java.util.Scanner;
public class Iqtest
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[100];
		int temp=0,count=0,x=0,y=0;
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
			if(ar[i]%2==0)
			{
				count++;
				if(count==1)
				{
					y=i+1;	
				}
				
			}
			else
			{
				temp++;
				if(temp==1)
				{
					x=i+1;
				}
				
			}

		}

		if(temp<count)
			System.out.print(x);
		else
			System.out.print(y);


		sc.close();
	}
}