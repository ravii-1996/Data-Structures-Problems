import java.util.Scanner;

public class A650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s= sc.next();
			String temp=""+s.charAt(0);
			for(int i=1;i<s.length();i=i+2) {
				temp+=s.charAt(i);
			}
			System.out.println(temp);
		}
	}

}
