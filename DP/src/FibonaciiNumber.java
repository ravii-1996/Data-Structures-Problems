import java.util.Scanner;


/**
 * https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 * @author Ravii
 *Fn = {[(√5 + 1)/2] ^ n} / √5  -- BEST Solution
  *Reference: http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibFormula.html
  *recursive solution fib(n-1) + fib(n-2)
 */

public class FibonaciiNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Fib Memoization : "+fibMemoization(n));
		System.out.println("Fib Tabulation : "+fibTabulation(n));
		//Best Solution is O(1)
	}

	private static int fibTabulation(int n) {
		// TODO Auto-generated method stub
		
		int dp [] = new int[n+1];
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2; i<=n;i++) {
			dp[i]= dp[i-1]+dp[i-2];
		}
		return dp[n];
	}

	private static int fibMemoization(int n) {
		// TODO Auto-generated method stub
		int dp [] = new int[n+1];
		if(dp[n]==0) {
			if(n==0 || n==1)
				return n;
			dp[n] = fibMemoization(n-1)+ fibMemoization(n-2);
		}
		return dp[n];
	}

}
