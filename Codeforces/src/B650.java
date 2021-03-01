import java.util.Scanner;

public class B650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int even=0, odd=0;
			for(int i=0;i<n;i++) {
				int arr= sc.nextInt();
				if(i%2==0 && arr%2!=0)
					even++;
				if(i%2!=0 && arr%2==0)
					odd++;
			}
			if(odd==0 && even==0)
				System.out.println(0);
			else if(odd==even)
				System.out.println(odd);
			else
				System.out.println(-1);
			
		}
	}

}
