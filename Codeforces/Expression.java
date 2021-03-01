import java.util.Scanner;
public class Expression
{
	public static void main(String asd[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int x1=a+b+c;
		int x2=a+b*c;
		int x3=a*b*c;
		int x4=a*b+c;
		int x6=a*(b+c);
		int x5=(a+b)*c;
			if(x1>=x4&&x1>=x2&&x1>=x3&&x1>=x5&&x1>=x6)
			System.out.println(x1);
			else if(x2>=x4&&x2>=x1&&x2>=x3&&x2>=x5&&x2>=x6)
			System.out.println(x2);
			else if(x3>=x4&&x3>=x2&&x3>=x1&&x3>=x5&&x3>=x6)
			System.out.println(x3);
			else if(x4>=x1&&x4>=x2&&x4>=x3&&x4>=x5&&x4>=x6)
			System.out.println(x4);
			else if(x5>=x4&&x5>=x2&&x5>=x3&&x5>=x1&&x5>=x6)
			System.out.println(x5);
			else if(x6>=x4&&x6>=x2&&x6>=x3&&x6>=x5&&x6>=x1)
			System.out.println(x6);
	}
}