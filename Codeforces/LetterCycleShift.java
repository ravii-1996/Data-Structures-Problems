import java.util.Scanner;
public class LetterCycleShift
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str="";
		for(int i=0;i<s.length();i++)
			{
				int x=(int)s.charAt(i);
				if(x==97)
					x=98;
				str=str+String.valueOf(Character.toChars(x-1));
			}
		
			System.out.println(str);
		sc.close();
	}
}