package LongJulyContest;

import java.util.Scanner;

public class AdaKing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc= new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0)
			{
				int n =sc.nextInt();
				for(int i=1;i<=8;i++) {
					for(int j=1;j<=8;j++) {
						if(j==1 && i==1 && n>=1) {
							System.out.print("O");
							n--;
						}
						else if(n>=1) {
							System.out.print(".");
							n--;
						}
						else {
							System.out.print("X");
						}
					}
					System.out.println();
				}
			}
			
		}
		catch(Exception e) {
			
		}

	}

}
