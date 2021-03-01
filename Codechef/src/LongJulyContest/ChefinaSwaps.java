package LongJulyContest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class ChefinaSwaps {

	public static void main(String[] args) {


		try {
			Scanner sc= new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0)
			{
				int n =sc.nextInt();
				int arr1[] = new int[n];
				int arr2[] = new int[n];
				for(int i=0;i<n;i++)
					arr1[i]=sc.nextInt();
				for(int i=0;i<n;i++)
					arr2[i]=sc.nextInt();
				Arrays.parallelSort(arr1);
				Arrays.parallelSort(arr2);
				
				ArrayList<Integer> a1= new ArrayList<Integer>();
				ArrayList<Integer> a2= new ArrayList<Integer>();
				int i=0, j=0;
				while(i<n && j<n) {
					
					if(arr1[i]==arr2[j]) {
						i++;
						j++;
					}
					else if(arr1[i]<arr2[j])
					{
						a1.add(arr1[i]);
						i++;
					}
						
					else {
						a2.add(arr2[j]);
						j++;
					}
						
				}
				while(i<n) {
					a1.add(arr1[i]);
					i++;
				}
				while(j<n) {
					a2.add(arr2[j]);
					j++;
				}
//				System.out.println(a1+ ""+  a2);
				boolean flag=false;
				HashMap<Integer,Integer> hm= new HashMap<Integer, Integer>(); 
				for(int x=0,y=0; x<a1.size() && y<a2.size();x++,y++)
				{
					Integer temp1 = hm.get(a1.get(x));
					hm.put(a1.get(x), temp1==null ? 1: temp1+1);
					
					Integer temp2 = hm.get(a2.get(y));
					hm.put(a2.get(y), temp2==null ? 1: temp2+1);
					
				}
//				System.out.println(hm);
				for (Map.Entry entry : hm.entrySet()) { 
		            if((int)entry.getValue()%2!=0) {
		            	flag=true;
		            	break;
		            }
		        } 
				
				if(a1.isEmpty() && a2.isEmpty())
					System.out.println(0);
				else if(flag) {
					System.out.println(-1);
				}
					
				else {
					long sum =0;
					for(int i1=0,j1=a2.size()-1;i1<a1.size() && j1>=0; i1=i1+2, j1=j1-2) {
						sum+= Math.min(a1.get(i1), a2.get(j1));
					}
					System.out.println(sum);
				}
			}
			
		}
		catch(Exception e) {
			
		}
	}

}
