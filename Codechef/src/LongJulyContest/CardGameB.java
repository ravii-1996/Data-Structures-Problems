package LongJulyContest;

import java.util.Scanner;

public class CardGameB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc= new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0)
			{
				long chef=0, motry=0;
				int n= sc.nextInt();
				
				for(int i=0;i<n;i++) {
					int c= power(sc.nextInt());
					int m= power(sc.nextInt());
					
					if(c>m)
						chef++;
					else if(c<m)
						motry++;
					else {
						chef++;
						motry++;
					}
				}
				
				if(chef>motry)
					System.out.println(0 + " "+ chef);
				else if(motry>chef)
					System.out.println(1+ " "+ motry);
				else
					System.out.println(2+ " "+ chef);
			}
			
		}
		catch(Exception e) {
			
		}
	}

	private static int power(int n) {
		int sum; 
		  
        /* Single line that calculates sum */
        for (sum = 0; n > 0; sum += n % 10, n /= 10); 
        return sum;
	}

}
