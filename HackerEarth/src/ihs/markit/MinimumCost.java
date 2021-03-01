package ihs.markit;

import java.util.Scanner;

public class MinimumCost {
	
	static int N = (int) (1e5+2);
	static int inf = (int) 1e17;
	static int[] dp= new int[N];
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			for(int i=0;i<N;i++){
	            dp[i] = inf;
	        }
			int sum=0;
			for(int j=0;j<t;j++) {
				sum+=n+m;
			}
			solve(n,m,sum);
		}
		
	}

	private static void solve(int n, int m, int sum) {
		// TODO Auto-generated method stub
	    int i,j,k;
	    dp[n] = 0;
	    for(i=n;i<=m;i++){
	        for(j=2;j<=Math.sqrt(i);j++){

	            if(i%j==0){
	                if(i+j<=m && j%2==0){
	                    dp[i+j] = Math.min(dp[i+j], dp[i]+(i/j));
	                }
	                int other = i/j;
	                if(other!=j && (i+other<=m) && (other%2==0)){
	                    dp[i+other] = Math.min(dp[i+other], dp[i] + (i/other));
	                }
	            }
	        }
	    }
	    if(dp[m]>=inf)
	        System.out.println(-1);

	    else
	        System.out.println(dp[m]);

	    if(sum/2>0)
	    	sum=sum/2;
	}
}
