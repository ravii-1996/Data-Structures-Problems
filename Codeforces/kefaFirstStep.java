import java.util.Scanner;
public class KefaFirstStep
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0,flag=0,temp2=0;
		int count=1,k=0;
		for(int i=0;i<n;i++)
			{
				int x=sc.nextInt();
				if(x>0)
				{
					if(x>=temp)
					{
						count++;
					}
					else
					{
						if(count>k)
						{
							 flag=count;
						}
						else
						{
							temp2=k;
						}
							k=count;
							count=0;
					}
				}
				temp=x;
			}

		if(flag>temp2)
			System.out.println(flag);
		else
			System.out.println(temp2);

		
		sc.close();
	}
}