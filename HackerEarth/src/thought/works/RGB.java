package thought.works;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RGB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String num = sc.next();
		
		ArrayList<Integer> R = new ArrayList<Integer>();
		ArrayList<Integer> G = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='R') {
				R.add(Integer.parseInt(""+num.charAt(i)));
			}
			else if(s.charAt(i)=='G') {
				G.add(Integer.parseInt(""+num.charAt(i)));
			}
			else
				B.add(Integer.parseInt(""+num.charAt(i)));
		}
		Collections.sort(R,Collections.reverseOrder());
		Collections.sort(G,Collections.reverseOrder());
		Collections.sort(B,Collections.reverseOrder());
		
		String out="";
		int x=0,y=0,z=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='R') {
				out+=R.get(x++);
			}
			else if(s.charAt(i)=='G') {
				out+=G.get(y++);
			}
			else{
				out+=B.get(z++);
			}	
		}
		System.out.println(out);
	}

}
