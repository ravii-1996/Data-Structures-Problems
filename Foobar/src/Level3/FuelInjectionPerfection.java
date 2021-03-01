package Level3;

import java.util.Scanner;

public class FuelInjectionPerfection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
	}
	
	private static int solution(String s) {
		// TODO Auto-generated method stub
		long n = Long.valueOf(s);
		int count=0;		
		while(n>1) {
			if ((n&1)==0)
			    n>>= 1;
			else {
				if (n == 3 || n % 4 == 1)
					n=n-1;
				else
					n=n + 1;
			}
			count++;
		}
			
		return count;
	}

}
