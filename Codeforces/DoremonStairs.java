
 import java.util.Scanner;

public class DoremonStairs
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
       int n = in.nextInt(),m = in.nextInt();
       int ans = -1;
       for(int i = (n + 1)/2; i <= n ; i++)
           if(i%m == 0)
           {
               ans = i;
               break;
           }
        System.out.println(ans);
    }
}