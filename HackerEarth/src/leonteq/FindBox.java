package leonteq;

import java.util.Scanner;

public class FindBox {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int n= sc.nextInt();
		long presum[]= new long[n];
		long temp=0;
		for(int i=0;i<n;i++) {
			temp+=sc.nextLong();
			presum[i]=temp;
		}
		int Q= sc.nextInt();
		for(int i=0;i<Q;i++) {
			System.out.println(findBox(sc.nextInt(), presum)+1);
		}
		
	}

	private static int findBox(int target, long[] presum) {
		int n = presum.length; 
		  
        if (target <= presum[0]) 
            return 0;
  
        int i = 0, j = n, mid = 0; 
        while (i < j) { 
            mid = (i + j) / 2; 
  
            if (presum[mid] == target) 
                return mid;
            if (target < presum[mid]) { 
                if (mid > 0 && target > presum[mid - 1])  
                    return mid; 
                j = mid;               
            } 
             else { 
                if (mid < n-1 && target < presum[mid + 1])  
                    return mid+1;                 
                i = mid + 1;
            } 
        } 
        return mid;
	}

}
