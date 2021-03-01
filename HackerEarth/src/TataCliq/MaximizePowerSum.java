package TataCliq;
import java.util.Scanner;

public class MaximizePowerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int t= sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n = sc.nextInt();
			int l=0;
			long sum =0;
			int heights[] = new int[n];
			int pow[] = new int[n];
			for(int i=0;i<n;i++) {
				heights[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				pow[i]=sc.nextInt();
			}
			
			
			for(int i=0;i<n;i++) {
				if(i<n-1 && heights[i]==heights[i+1])
					continue;
				sum+= maximize(pow, l, i);
				l=i+1;
			}
			System.out.println(sum);
		}
	}

	private static long maximize(int[] pow, int l, int h) {
		long evensum=0,oddsum=0;
		for(int i=l;i<=h;i++) {
			if(i%2!=0)
				oddsum+=pow[i];
			else
				evensum+=pow[i];
		}
		return (long) Math.max(evensum,oddsum);	
	}

}
