import java.util.Scanner;

public class Memoryc
{

    public static void main(String[] args) 
    {
      Scanner in = new Scanner (System.in);
      int n=in.nextInt();
      int[] arr=new int[n];
      int[] temp=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
        if(i>0)
        {
          temp[i-1]=arr[i]+arr[i-1];
        }
        if(i==(n-1))
        {
          temp[i]=arr[i];
        }

      }


      for(int j=0;j<n;j++)
      {

        System.out.println(temp[j]);
      }
    }
}