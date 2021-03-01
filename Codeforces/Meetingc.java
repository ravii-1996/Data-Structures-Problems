import java.util.Scanner;

public class Meetingc
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		long l = in.nextLong();
		long r = in.nextLong();
		long ll = in.nextLong();
		long rr = in.nextLong();
		long k = in.nextLong();
		long x=r-ll;
		
		if(x<0)
		{
			System.out.println("0");
		}
		else
		{
			if(k<=r&&k>=ll)
			{
				System.out.println(x);		
			}
			else
			{
				System.out.println(x+1);
			}
		}

	}
}	