package Level2;
//"https://foobar.withgoogle.com/?eid=I1AMo" refer friend
import java.util.Scanner;

public class RouteSalute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(solution(s));
		
	}

	private static int solution(String s) {
		int total=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='>')
				total+=countLeftsalute(s.substring(i));
		}
		return total*2;
	}

	public static int countLeftsalute(String s) {
		int count=0;
		for(int i=0;i<s.length(); i++) {
			if(s.charAt(i)=='<')
				count++;
		}
		return count;
	}

}
