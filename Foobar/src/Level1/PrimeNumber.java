package Level1;

import java.util.Scanner;

public class PrimeNumber { 
	
	static int MAX=30000;  
	static boolean prime[] = new boolean [MAX+1] ; 
	static void SieveOfEratosthenes() 
	{ 
		for(int i = 0; i <= MAX; i++) 
			prime[i] = true ; 
		
		prime[1] = false; 
		
		for (int p = 2; p * p <= MAX; p++) { 
			if (prime[p] == true) { 
				//Set all multiples of p to non-prime 
				for (int i = p * 2; i <= MAX; i += p) 
					prime[i] = false; 
			} 
		} 
	} 
	
	static String solve(int n) 
	{ 
		String s="";		
		for(int i=2;i<prime.length;i++) {
			if(prime[i]==true)
				s+=i;
			if(s.length()-6 >n )
				break;
		}
		s=s.substring(n, n+5);
		return s;
	} 
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SieveOfEratosthenes(); 
		String  x = solve(n);
		System.out.println(x); 
			
	} 
} 

