package LongDecContest;

import java.util.Scanner;

public class EVENPSUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			long a= sc.nextLong();
			long b= sc.nextLong();
			long oddA=0;
			long oddB=0;
			long evenA=0;
			long evenB=0;
			
			if(a%2==0) {
				oddA=a/2;
				evenA=a/2;
			}
			else {
				oddA=a/2+1;
				evenA=a/2;
			}
			if(b%2==0) {
				oddB=b/2;
				evenB=b/2;
			}
			else {
				oddB=b/2+1;
				evenB=b/2;
			}
				
			System.out.println((oddA*oddB)+(evenA*evenB));
		}
	}

}
