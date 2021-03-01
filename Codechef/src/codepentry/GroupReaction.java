package codepentry;

import java.util.Scanner;

//https://www.codechef.com/COPT2020/problems/GRDAY1
public class GroupReaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			int n= sc.nextInt();
			int k= sc.nextInt();
			String dir= sc.next();
			String lang = sc.next();
			if(dir.equals("L"))
			{
				if(n%2==0) {
					if(lang.equals("H"))
						lang="E";
					else
						lang="H";
				}
				System.out.println(k +" "+lang);
					
			}
			if(dir.equals("R"))
			{
				if(n%2!=0) {
					if(lang.equals("H"))
						lang="E";
					else
						lang="H";
				}
				k=n-k+1;
				System.out.println(k +" "+lang);
					
			}
			
		}
	}

}
