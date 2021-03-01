package Zeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Interval implements Comparable<Interval> 
{  
    public int start;  
    public int end; 
    public Interval(int start, int end)  
    { 
        this.start = start; 
        this.end = end; 
    }
	@Override
	public int compareTo(Interval o) {
		return this.start- o.start;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ "+this.start +" , "+this.end+" }"; 
	}
	
};  
public class Meeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Interval> arr = new ArrayList<Interval>();
		
		int start[] = new int[n];
		int end[] = new int[n];
		
		for(int i=0;i<n;i++) {
			start[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			end[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			arr.add(new Interval(start[i], end[i]));
		}
		
		Collections.sort(arr);
		
		find(arr,n);
		
		
	}

	private static void find(List<Interval> arr, int n) {
		
		for(int j=0;j<n-1;j++) {
			int count =0;
			for(int i=j+1;i<n;i++) {
				if (arr.get(j).end>=arr.get(i).start) {
					count++;
					if(count>=2) {
						System.out.println(0);
						return;
					}	
				}
				else if(arr.get(j).end<arr.get(i).start) {
					break;
				}
			}
		}
		
		System.out.println(1);
	}

}
