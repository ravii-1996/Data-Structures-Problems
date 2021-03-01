package leonteq;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ListReduction {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int n= sc.nextInt();
		int k= sc.nextInt();
		long arr[]= new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
		}
		System.out.println(findMin(arr, k));
		
	}

	private static long findMin(long[] arr, int k) {
		TreeSet<Long> ts= new TreeSet<Long>();
		HashMap<Long,Integer> hm = new HashMap<Long,Integer>();
		
		 for (long x : arr) {

				Integer j = hm.get(x); 
		        hm.put(x, (j == null) ? 1 : j + 1);
		        ts.add(x);
		 }
		 
		 while(k-->0) {
			// push data in map when remove
			 long lower=ts.pollFirst();
			 Integer pop = hm.get(lower); 
		     hm.put(lower, (pop == null) ? 0 : pop-1);
		     
		     //push data in map when add
			 Integer j = hm.get(lower*2); 
		     hm.put(lower*2, (j == null) ? 1 : j + 1);
		     ts.add(lower*2);
		     
		     long higher = ts.last();
		     if(higher%2!=0 && ts.contains(higher-1)) {
		    	// push data in map when remove
		    	 ts.remove(higher-1);
		    	 Integer pop1 = hm.get(higher-1); 
			     hm.put(higher-1, (pop1 == null) ? 0 : pop1-1);
			     
			     //push data in map when add
				 Integer push = hm.get((higher-1)/2); 
			     hm.put((higher-1)/2, (push == null) ? 1 : push + 1);
			     ts.add((higher-1)/2);
		     }
		     else {
		    	// push data in map when remove
		    	 ts.remove(higher);
		    	 Integer pop1 = hm.get(higher); 
			     hm.put(higher, (pop1 == null) ? 0 : pop1-1);
			     
			   //push data in map when add
			     if(higher%2!=0) {
			    	 Integer push = hm.get((higher/2)+1); 
				     hm.put((higher/2)+1, (push == null) ? 1 : push + 1);
				     ts.add((higher/2)+1);
			     }
			     else {
			    	 Integer push = hm.get(higher/2); 
				     hm.put(higher/2, (push == null) ? 1 : push + 1);
				     ts.add(higher/2);
			     }
				 
			     
		     }
		     //System.out.println(hm);
		 }
		 long temp=0;
		 for(Map.Entry map : hm.entrySet()) {
			 
			 temp+=(long) map.getKey() * (Integer)map.getValue();
		 }
	     
		return temp;
	}

}
