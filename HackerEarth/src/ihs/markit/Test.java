package ihs.markit;

import java.text.DecimalFormat;
import java.util.*;
public class Test{
	
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String a= sc.next();
		int indx= a.lastIndexOf(",");
		if(indx<0) {
			System.out.println(a);
			return;
		}
		String lastPart=a.substring(indx);
		
		String str[]= a.substring(0, indx).split(",");
		String flag="IN";
		for(int i=0;i<str.length;i++) {
			if(str[i].length()==3) {
				flag="US";
				break;
			}
				
		}
		String firstPart= a.substring(0,indx).replaceAll(",","" );
		System.out.println(firstPart.replace("/.{3}/g", "$&,"));
		if(flag=="IN") {
			//System.out.println(new DecimalFormat("###,###,###").format(Integer.valueOf(firstPart)).toString()+ lastPart);
			
		}
		else {
			//System.out.println(new DecimalFormat("##,##,##").format(Integer.valueOf(firstPart)).toString()+ lastPart);
		}

	}

}
