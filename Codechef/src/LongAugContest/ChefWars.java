package LongAugContest;

//https://www.codechef.com/AUG20B/problems/CHEFWARS
import java.util.Scanner;

public class ChefWars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();
			while(n-->0) {
				int health= sc.nextInt();
				int power= sc.nextInt();
				
				for(;;) {
					if(health<=0) {
						System.out.println(1);
						break;
					}
						
					else if(power<=0) {
						System.out.println(0);
						break;
					}
					health-=power;
					power=power/2;
				}
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
