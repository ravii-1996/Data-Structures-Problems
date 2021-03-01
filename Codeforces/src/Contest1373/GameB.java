package Contest1373;

import java.util.Scanner;

public class GameB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n-->0) {
			String s= sc.next();
			boolean flag = false;
			for(int i=0;i<s.length();i++) {
				if(i<s.length()-1 && s.charAt(i)!= s.charAt(i+1) && i%2==0)
					flag=true;
				else if(i<s.length()-1 && s.charAt(i)!= s.charAt(i+1) && i%2!=0)
					flag=false;
			}
			if(flag)
				System.out.println("DA");
			else
				System.out.println("NET");
		}
	}

}
