import java.util.Scanner;

public class TheWall
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
       int x=in.nextInt();
       int y=in.nextInt();
       int a=in.nextInt();
       int b=in.nextInt();
       int p=(b-a)/x+1;
       int q=(b-a)/y+1;
       int m=a;
       int count=1;
       if(p>=q)
       {
          for(int i=0;i<p;i++)
          {
            a=a+x;
            int temp=a;
            m=m+y;
            int flag=m;
            if(temp==flag)
              count++;
          }
       }
       else
       {
          for(int i=0;i<q;i++)
          {
            a=a+x;
            int temp=a;
            m=m+y;
            int flag=m;
            if(temp==flag)
              count++;
          }
       }
      System.out.println(count);
    }
}