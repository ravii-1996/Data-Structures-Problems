package LongJulyContest;

import java.util.*;
import java.util.Map;
import java.util.Scanner;

public class MissingPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		try {
			Scanner sc= new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0)
			{
				int n =sc.nextInt();
				List<Integer> listX = new ArrayList<>();  
				List<Integer> listY = new ArrayList<>();  
				for(int i=0;i<(4*n)-1;i++) {
					listX.add(sc.nextInt());
					listY.add(sc.nextInt());
				}
				
				Set<Integer> setX = new HashSet<Integer>(listX); 
				Set<Integer> setY = new HashSet<Integer>(listY); 
				
				for (Integer i : setX) {  
		             if(Collections.frequency(listX, i)%2!=0) 
		            	 System.out.println(i);
		        } 
				for (Integer i : setY) {  
		             if(Collections.frequency(listY, i)%2!=0) 
		            	 System.out.println(i);
		        }
			}
			
		}
		catch(Exception e) {
			
		}
	}

}
