import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/580/A
public class A580 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int dp[]= new int[n]; 
		dp[0]=1;
		for(int i=1;i<n;i++) {
			if(arr[i]>=arr[i-1])
				dp[i]=dp[i-1]+1;
			else
				dp[i]=1;
		}
		//System.out.println(Arrays.toString(dp));
		int max= Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(max<dp[i])
				max=dp[i];
		}
		System.out.println(max);
			

	}

}
