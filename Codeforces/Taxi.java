import java.util.Scanner;

public class Taxi
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] s = new int[5];

		for(int i = 0; i < n; i++) 
		{
			s[in.nextInt()]++;

		}
		s[1] = Math.max(0, s[1] - s[3]);
		System.out.println(s[4] + s[3] + (s[1] + s[2] * 2 + 3) / 4);
	}
}	