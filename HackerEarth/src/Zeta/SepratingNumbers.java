package Zeta;

import java.util.Scanner;

public class SepratingNumbers {

	public static void find(int t, Scanner sc) {
		long res=0;
		for(int i=0;i<t;i++) {
			String n = sc.next();
			if(n.contains("99") || n.length()==1) {
				res+= (long) Math.pow(2, i);
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		find(t,sc);
		
	}

}
