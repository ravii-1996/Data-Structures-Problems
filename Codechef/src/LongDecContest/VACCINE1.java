package LongDecContest;

import java.util.Scanner;

class VACCINE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		int d1 = sc .nextInt();
		int v1 = sc .nextInt();
		int d2 = sc .nextInt();
		int v2 = sc .nextInt();
		int p = sc .nextInt();
		int total=0;
		int days=0;
		if(d1>=d2){
		    for(int i=d2;i<d1;i++){
		        if(total>=p){
    		        System.out.println(days);
    		        return;
		        }
		        total+=v2;
		        days=i;
		    }
		}
		else{
		    for(int i=d1;i<d2;i++){
		        if(total>=p){
    		        System.out.println(days);
    		        return;
		        }
		        total+=v1;
		        days=i;
		    }
		}
		if(d1==d2)
			days=d1-1;
		for(;;){
		    if(total>=p){
		        System.out.println(days);
		        return;
		    }
		    total+=v1+v2;
		    days++;
		}
		}
		catch(Exception e) {
			
		}
	}

}
