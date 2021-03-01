import java.util.Scanner;
import java.util.regex.*;
public class ChatRoom
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println((s.matches("(.*)h(.*)e(.*)l(.*)l(.*)o(.*)")?"YES":"NO"));
		sc.close();
	}
}