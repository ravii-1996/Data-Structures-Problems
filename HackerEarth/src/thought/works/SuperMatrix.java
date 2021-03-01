package thought.works;

import java.util.Scanner;

public class SuperMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt()-1;
		int b = sc.nextInt()-1;
		int x = sc.nextInt()-1;
		int y = sc.nextInt()-1;
		
		long arr[] = new long[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLong();
		}
		
		long matrix [][] = new long[n][n];
		long out=0;
		for(int i=a;i<=x;i++) {
			for(int j=b;j<=y;j++) {
				//System.out.println("Matrix = "+(arr[i]&arr[j]));
				out= out ^ (arr[i]&arr[j]);
				//System.out.println("Out ="+ out);
			}
		}
		System.out.println(out);
	}

}
