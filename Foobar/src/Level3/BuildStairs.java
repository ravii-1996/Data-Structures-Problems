package Level3;
// help : https://jtp.io/2016/07/26/dynamic-programming-python.html
import java.util.Scanner;

public class BuildStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

	private static int solution(int n) {

		int dp[][]= new int[n+1][n+1];
		dp[0][0]=1;
		for(int i=1; i<=n; i++) {
			for(int j=0; j<=n;j++) {
				dp[i][j]= dp[i-1][j];
				if(j>=i)
				{
					dp[i][j] += dp[i - 1][j - i];
				}
			}
		}
		return dp[n][n]-1;
	}

}
