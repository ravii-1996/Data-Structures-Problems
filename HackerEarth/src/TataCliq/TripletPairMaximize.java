package TataCliq;

import java.util.Arrays;
import java.util.Scanner;

public class TripletPairMaximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			Arrays.sort(arr);
			int len = arr.length;
			int i=1;
			long sum=0;
			while(i<=len/3) {
				sum = sum + (long) arr[len-2*i];
				i++;
			}
			System.out.println(sum);
		}
	}

}
