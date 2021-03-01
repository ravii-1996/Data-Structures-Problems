package AutoRabit;

import java.util.Scanner;

public class UniqueSubSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long M = 1000000007;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] ch = new int[256];
			String s= sc.next();
			for(int i=0; i<n;i++) {
				ch[(int)s.charAt(i)]++;
			}
			long total=1;
			boolean flag=true;
			for(int i=97;i<=122;i++) {
				if(ch[i]<1) {
					flag=false;
					break;
				}
				if(ch[i]>1)
				{
					total= (total%M) * (ch[i]%M);
				}
			}
			if(flag)
				System.out.println(total);
			else
				System.out.println(0);
		}
	}

}
