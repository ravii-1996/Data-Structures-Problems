
import java.util.*;
public class Helpful

{
 public static void main(String args[])
 {
  
  Scanner sc= new Scanner(System.in);
  String []str=sc.next().split("\\+");
  Arrays.sort(str);
  System.out.print(str[0]);
  for( int i=1;i<str.length;i++)
  System.out.print("+" +str[i]);
  }
  }