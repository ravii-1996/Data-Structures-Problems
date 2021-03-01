import java.util.Scanner;

//https://codeforces.com/problemset/problem/189/A
public class A189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println(maxCut(n, a,b,c));
		
	}

	private static int maxCut(int n, int a, int b, int c) {
		if(n<0)
			return 0;
		if(n==0)
			return 0;
		return Math.max(1+ maxCut(n-a,a,b,c),Math.max(1+ maxCut(n-b,a,b,c), 1+ maxCut(n-c,a,b,c)));
		
	}

}
