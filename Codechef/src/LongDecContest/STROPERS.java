package LongDecContest;

import java.util.HashSet;
import java.util.Scanner;

public class STROPERS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			HashSet<String> hs = new HashSet<>();
			String s = sc.next();
			int n=s.length();
			int k=n;
			while(k>0) {
				int x=0, y=k;
				for(int i=n;i>=k;i--,x++,y++){
					String str=s.substring(x,y);
					int len= str.replaceAll("0", "").length();
					if(len>0 && len%2==0) {
//						System.out.println(new StringBuilder(str).reverse().toString()+ "reverse");
						if(!(hs.contains(new StringBuilder(str).reverse().toString()) || hs.contains(str)) )
							hs.add(str);
					}
					else
						hs.add(str);
					
				}
				k--;
			}
			//System.out.println(hs.toString());
			System.out.println(hs.size());
			
		}
	}

}
