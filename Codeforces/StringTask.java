import java.util.Scanner;
public class StringTask
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str="";
		int length=s.length();
		s=s.toLowerCase();
		for(int i=0;i<length;i++)
		{
			char k=s.charAt(i);
			if(!(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'||k=='y'))
			{
				str=str+"."+k;
			}
		}
		System.out.println(str);
		sc.close();
	}
}