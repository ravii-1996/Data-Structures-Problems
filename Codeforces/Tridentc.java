import java.util.Scanner;

public class Tridentc
{

    public static void main(String[] args) 
    {
      Scanner in = new Scanner (System.in);
      String s = in.nextLine();
      int l=s.length();
      int u=0,d=0,count=0,temp=0,p,q;
      if(l%2==0)
      {
        for(int i=0;i<l;i++)
        {

          char x=s.charAt(i);
          if(x=='U')
          {
            u++;
            
          }
          if(x=='L')
          {
            temp++;
          }
          if(x=='D')
          {
            d++;
            
          }
          if(x=='R')
          {
            count++;
            
          }
           
        }

      if(u>d)
      {
         p=(u-d);
         //System.out.println(p);
      }
      else
      {
        p=(d-u);
      }
         
      if(temp>count)
      {
        q=(temp-count);
        //System.out.println(q);
      }
      else
      {
        q=(count-temp);
      }

        System.out.println((p+q)/2);
      }




      else
      { 
        System.out.println("-1");
      }
      
    }
}