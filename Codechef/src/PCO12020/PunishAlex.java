package PCO12020;

import java.util.Scanner;

public class PunishAlex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			int n= sc.nextInt();
			int k= sc.nextInt();
			
			int diff =(n-1)*2;
			int num =1;
			boolean flag=true;
			while(num<k-diff)
			{
				
				num+=diff;
				if(num==k) {
					System.out.println(1);
					flag=false;
					break;
				}
				
			}
			if(flag) {
				int pos = k-(num-1);
				if(pos>n)
					System.out.println(n-(pos-n));
				if(pos<n)
					System.out.println(pos);
				if(pos==n)
					System.out.println(n);
			}

			
		}

	}

}
