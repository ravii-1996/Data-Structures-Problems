package LongDecContest;

import java.util.Scanner;

public class HXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long n,x;
		while(t-->0) {
			n = sc.nextLong();
			x = sc.nextLong();
			long[] a = new long[(int) (n+1)];
			for(int i =0;i<n;i++) {
				a[i] = sc.nextLong();
			}
			solve(n,x,a);
		}
	}

	private static void solve(long n, long x, long[] a) {
		 int i=0;
		 long p=0, r,k=0,z=0;
		 int flag;
		 for( k=x; k>0 && i<n-1; k-- ) {
			 flag=0;
			 p= (long) (Math.log(a[i])/Math.log(2));
			 r=(long) Math.pow(2, p);
			 a[i]= a[i]^r;
			 
			 for(int j =i+1; j<n; j++) {
				 if((a[j]^r)<a[j]) {
					 a[j]=a[j]^r;
					 flag=1;
					 break;
				 }
					 
			 }
			 if(flag==0) {
				 a[(int) (n-1)]=a[(int) (n-1)]^r;
			 }
			 
			 while(a[i]<=0) {
				 i++;
			 }
			 z=k+1;
		 }
		 
		 if(z>0) {
			 if(n<3 && z%2==0) {
				 a[(int) (n-1)]=a[(int) (n-1)]^1;
				 a[(int) (n-2)]=a[(int) (n-2)]^1;
				 
			 }
		 }
		 
		 for(int i1=0;i1<n;i1++) {
			 System.out.println(a[i1]);
		 }
		 
	}
}
