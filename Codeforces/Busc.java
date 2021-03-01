import java.util.Scanner;
public class Busc
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] array = new String[1000];
		int count=0,temp=0,flag=0;
		String str="++";
		for(int i=0;i<=n;i++)
			{
				String s=sc.nextLine();

				for(int j=0;j<s.length();j++)
				{
				if(j==0)
				{
					if('O'==s.charAt(j)&&'O'==s.charAt(j+1))
					{
						count++;
						flag++;
						if(flag==1&&temp==0)
						{

							s=str+s.substring(2,5);
						}
										
					}					
				
				}
				else if(j==3)
				{
					if('O'==s.charAt(j)&&'O'==s.charAt(j+1))
					{
						count++;
						temp++;
						if(temp==1&&flag==0)
						{
							s=s.substring(0,3)+str;
						}
					}
				}
				}
				array[i]=s;

			}
		if(count>0)
		{
			System.out.print("YES");
			for(int b=0;b<=n;b++)
			{
				System.out.println(array[b]);
			}
		}
		else
			System.out.println("NO");
		sc.close();
	}
}