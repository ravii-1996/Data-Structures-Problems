import java.util.Scanner;
public class BoyGirl
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		
		char temp[] = s.toCharArray();
		for(int i=0;i<s.length();i++)
			{
				char k=s.charAt(i);
				for(int j=0;j<i;j++)
				{
					if(i!=j)
					{
						if(k==temp[j])
						{
							count++;
						}
					}
					
				}
			}

			System.out.println(count);
		/*int l=s.length();
		int b=l-count+1;
		if(b%2==0)
		{
			System.out.println("CHAT WITH HER!");
		}
		else
		System.out.println("IGNORE HIM!");*/
		sc.close();
	}
}