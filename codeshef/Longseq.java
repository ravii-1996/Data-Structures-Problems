import java.util.Scanner;

class Longseq
{
	public static void main(String asd[])
	{
		 
		Scanner sc = new Scanner(System.in);
     	int n = sc.nextInt();
     	int[] a=new int[n+1];
     	int[] b=new int[n+1];
     	int count=0;
     	int temp=0;
     	for(int i=0;i<=n;i++)
     	{
     		String s=sc.nextLine();

     		for(int j=0;j<s.length();j++)
     		{
     			if('1'==s.charAt(j))
     			{
     				count++;
     			}
     				
     			if('0'==s.charAt(j))
     			{
     				temp++;

     			}
	
			}
	     			//System.out.println(temp);
     			//System.out.println(count);
			a[i]=count;
			b[i]=temp;
			count=0;
			temp=0;
		}
		for(int i=0;i<=n;i++)
		{
			if(a[i]!=0&&b[i]!=0)
			{
				if(a[i]==1||b[i]==1)
				{
					System.out.println("YES");
				}
				else
					System.out.println("NO");
			}

		}
	}	
}