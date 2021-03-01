package TataCliq2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class EndGame {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			int d = sc.nextInt();
			TreeSet<Integer> pawns = new TreeSet<>();
			
			HashMap<Integer,Integer> hm = new HashMap<>();
			
			boolean flag=false;
			for(int i=0;i<n;i++) {
				Integer x= sc.nextInt();
				Integer j = hm.get(x); 
		        hm.put(x, (j == null) ? 1 : j + 1);
				pawns.add(x);
			}
			int i;
			for(i=1;i<=d;i++) {
				int p= pawns.last();
				s-=p;
				if(s<=0) {
					flag=true;
					break;
				}
				Integer j = hm.get(p);	
				if(j==1)
					pawns.remove(p);
				Integer aa = hm.get(p/2);
				hm.put(p/2, (aa == null) ? 1 : aa + 1);
				pawns.add(p/2);
				System.out.println(pawns.toString());
			}
			if(flag)
				System.out.println(i);
			else
				System.out.println("Impossible");
		}
		
	}
}
