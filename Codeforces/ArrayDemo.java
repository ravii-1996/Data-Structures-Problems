import java.util.Arrays;

public class Ques2
{

   public static void main(String args[]) 
   {

      double arr[] = {86,75,96.5,99.2,65.5,78.56,89,88.9,89.1,100,99.45,77.6,79.5};

   Arrays.sort(arr);
   System.out.println("The sorted int array is:");
   for (int i=12;i>7;i--)
   {
   System.out.println(arr[i]);
   }
   }
}