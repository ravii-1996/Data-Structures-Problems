package LongDecContest;

import java.util.Scanner;

public class VACCINE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int d = sc.nextInt();
			int risk=0;
			int days=0;
			for(int j=0;j<n;j++) {
				int age =sc.nextInt();
				if(age>=80 || age<=9 ) {
					risk++;
				}
					
			}
			int unrisk= n-risk;
			if(unrisk%d!=0)
				days+=(unrisk/d)+1;
			else
				days+=(unrisk/d);
			if(risk%d!=0)
				days+=(risk/d)+1;
			else
				days+=(risk/d);
			System.out.println(days);
			
		}
	}

}
