import java.util.Scanner;

public class C650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s= sc.next();
			int count=0;
			for (int i = 0; i < n - 2*k; i++) { 
	            boolean flag=true;
	            for (int j = i; j < 2*k+1+ i; j++) {
	            	if(s.charAt(j)=='1') {
	            		flag=false;
	            		break;
	            	}
	            }
	            if(flag)
	            	count++;
	        } 
			

			System.out.println(count);
			
		}

	}

}
