import java.util.Scanner;

public class Capslock 
{

	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (str.toUpperCase().equals(str)) 
		{
			str = str.toLowerCase();
		}
		else 
		{
			if (str.substring(1).toUpperCase().equals(str.substring(1))) 
			{
				str = (str.charAt(0) + "").toUpperCase() + str.substring(1).toLowerCase();
			}
		}
		System.out.println(str);
	}
}