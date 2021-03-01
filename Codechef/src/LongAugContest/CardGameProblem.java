package LongAugContest;

import java.util.Scanner;

public class CardGameProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0) {
				int c = sc.nextInt();
				int r = sc.nextInt();
				
				int digitc=0;
				int digitr=0;
				
				if(c <=9 && r<=9) {
					System.out.println(1+ " "+ 1);
					continue;
				}
				if(c%9!=0)
					digitc=c/9+1;
				else
					digitc=c/9;
				
				if(r%9!=0)
					digitr=r/9+1;
				else
					digitr=r/9;
				
				if(digitr<=digitc)
					System.out.println(1+ " "+ digitr);
				else
					System.out.println(0 + " "+digitc );
					
					
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
