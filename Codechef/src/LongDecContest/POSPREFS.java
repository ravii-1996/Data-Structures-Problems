package LongDecContest;

import java.util.Scanner;

public class POSPREFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int pos=k , neg=n-k;
			int met=0;
			if(pos>neg) {
				met=neg;
			}
			else
				met=pos;
			int i;
			for( i=1;i<=met*2;i++) {
				if(i%2==0) {
					System.out.println(-i);
					neg--;
				}
				else {
					System.out.println(i);
					pos--;
				}
			}
			while(pos>0) {
				System.out.println(i);
				pos--;
				i++;
			}
			while(neg>0) {
				System.out.println(-i);
				neg--;
				i++;
			}
		
			
		}
	}

}
