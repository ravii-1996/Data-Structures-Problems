package LongAugContest;

import java.util.Scanner;

public class LinearChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0) {
				int n = sc.nextInt();
				int k = sc.nextInt();
				int p[]= new int[n+1];
				for(int i=0;i<n;i++) {
					p[i]=sc.nextInt();
				}
				int min=Integer.MAX_VALUE;
				int assign=0;
				for(int i=0;i<n;i++) {
					int temp=p[i];
					for(int j=1;p[i]<=k; j++) {
						if(p[i]==k && j<min) {
							min=j;
							assign=temp;
						}	
						p[i]+=temp;
					}
					
				}
				if(assign==0)
					System.out.println(-1);
				else
					System.out.println(assign);
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
