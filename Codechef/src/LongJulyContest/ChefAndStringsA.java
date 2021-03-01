package LongJulyContest;

import java.util.Scanner;

public class ChefAndStringsA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc= new Scanner(System.in);
			int t= sc.nextInt();
			while(t-->0)
			{
				int n= sc.nextInt();
				int arr[] = new int[n];
				for(int i=0;i<n;i++) {
					arr[i]= sc.nextInt();
				}
				long sum=0;
				for(int i=1;i<n;i++) {
					sum +=Math.abs(arr[i]-arr[i-1])-1;
					//System.out.println(sum);
				}
				System.out.println(sum);
			}
			
		}
		catch(Exception e) {
			
		}
	}

}
