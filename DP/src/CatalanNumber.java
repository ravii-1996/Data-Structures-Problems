import java.util.Scanner;
/**
 * 
 * @author Ravii
 * recurisve approach : Cn+1 = Summation of (Ci*Cn-i)  where C0=1
 *
 */
public class CatalanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Fib Memoization : "+catalanMemoization(n));
		System.out.println("Fib Tabulation : "+catalanTabulation(n));
	}

	private static int catalanTabulation(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int catalanMemoization(int n) {
		
		// TODO Auto-generated method stub
		int dp[] = new int[n+1];
		if(dp[n]<=0) {
			if(n<=1)
				return 1;
			for(int i=1;i<=n;i++) {
				dp[i] += catalanMemoization(i) * catalanMemoization(n-i-1) ;
			}
		}
		return dp[n];
	}

}
