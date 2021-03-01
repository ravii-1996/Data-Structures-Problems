package thought.works;

import java.util.Scanner;

public class SuperMatrixDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int t = sc.nextInt();
		
	    long a[]= new long[n+1];

	    for(int i=0;i<n;i++){
	    	a[i] = sc.nextLong();
	    }
	    
	    long bits[] = new long[32];
	    long dp[][]= new long[n+1][32];


	    for(int i=0;i<32;i++){
	        dp[0][i] = 0;
	        bits[i] = 0;
	    }

	    for(int i=1;i<=n;i++){
	        for(int j=0;j<32;j++){
	            if(((1<<j)&a[i-1])!=0)
	                dp[i][j] = dp[i-1][j]+1;
	            else
	                dp[i][j] = dp[i-1][j];
	        }
	    }

	    for(int i=t;i>=y;i--){
	        for(int j=0;j<32;j++){
	            if(((1<<j)&a[i-1])!=0){
	                bits[j]+=(dp[z][j]-dp[x-1][j]);
	            }
	        }
	    }

	    long ans = 0;

	    for(int i=0;i<32;i++){
	        if(bits[i]%2!=0){
	            ans|=(1<<i);
	        }
	    }
		System.out.println(ans);
	}

}
