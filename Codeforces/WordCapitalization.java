import java.util.Scanner;
public class WordCapitalization
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=Character.toString(s.charAt(0)).toUpperCase()+s.substring(1);
		System.out.println(s);
		sc.close();
	}
}