package Level2;

import java.util.Arrays;
import java.util.Scanner;

public class LAMBCHOP {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		System.out.println(solution(x, y));
	}
	
	public static String solution(long x, long y) {
		long count=1;
		if(x==1 & y==1)
		    return String.valueOf(1);
		long max=2, min=1, i=1, j=2;
		while(count>0) {
			count++;
			if(i==x && j==y) {
				return String.valueOf(count);
			}
			if(max==i && min==j)
			{
				max=i+1;
				i=min-1;
				j=max+1;
			}			
			i++;
			j--;
		}
		return null;
	}
}
