package PCO12020;

import java.util.Scanner;

public class MoreCake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		long total=0;
		while(t-->0) {
			long s = sc.nextLong();
			long n = sc.nextLong();
			long k = sc.nextLong();
			long r = sc.nextLong();
			
			long sum=0;
			for(long i=1 ; i<=n ;i++) {
				//System.out.print(k+"\t");
				sum = sum+k;
				k=k*r;
				
			}
			
			if(s-sum>0) {
				System.out.println("POSSIBLE "+ (s-sum));
				total=total + s-sum;
			}
				
			else {
				System.out.println("IMPOSSIBLE "+ (sum-s));
				total=total + s-sum;
			}
		}
		if(total>=0)
			System.out.println("POSSIBLE");
		else
			System.out.println("IMPOSSIBLE");
		
	}

}
