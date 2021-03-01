package ihs.markit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
public class MinimunDistance {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(100);
		TreeSet<Integer > set= new TreeSet<Integer>();
		while(t-->0) {
			int q = sc.nextInt();
			int p = sc.nextInt();
			solve(q, p, list, set);
			
		}
		sc.close();
	}

	private static void solve(int q, int p, ArrayList<Integer> list, TreeSet<Integer> set) {

		if(q==1) {
			list.add(p);
			set.add(p);
		}
		else if(q==2) {
			set.remove(list.get(p-1));
		}
		else {
			int a= Math.max(Math.abs(set.first()-p), Math.abs(set.last()-p));
			System.out.println(a);
		}
	
	}

}
