import java.util.Scanner;
import java.util.Scanner;
public class StonesTable 
{

	public static void main(String[] args) 
	{
		int n,k=0;
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();
	
		String s=sc.next();
	
		for(int i=0;i<n-1;i++)
		{ 
			if(s.charAt(i)==s.charAt(i+1))
			{
				k++;
			}
		}
		System.out.println(k);

	}

}