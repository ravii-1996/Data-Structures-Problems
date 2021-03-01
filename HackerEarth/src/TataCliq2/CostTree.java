package TataCliq2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CostTree {

	static class Edge{
		int vertex;
		int weight;
		public Edge(int vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}
		
	}
	static int N=100007;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		while(t-->0) {
			ArrayList<ArrayList<Edge>> v= new ArrayList<>(N);
			for (int i = 0; i < N; i++) 
	            v.add(new ArrayList<Edge>()); 
			ArrayList<Integer> a =new ArrayList<>(); 
			
			int n = sc.nextInt();
			int c= sc.nextInt();
			int u= sc.nextInt();
			
			for(int i=0;i<n-1;i++) {
				int x= sc.nextInt();
				int y= sc.nextInt();
				int z= sc.nextInt();
				v.get(x).add(new Edge(y,z));
				v.get(y).add(new Edge(x,z));
				
			}
			dfs(-1,u, v,a);
			Collections.sort(a, Collections. reverseOrder());
			System.out.println(a.toString());
			long ans=0;
			for(Integer it: a){
	            if(c<=0){
	                ans+=it;
	            }
	            c--;
	        }
	        System.out.println(ans);
		}
		
	}
	private static int dfs(int parent, int u, ArrayList<ArrayList<Edge>> v, ArrayList<Integer> a) {
		int cnt = 0;
		for(Edge it: v.get(u)){
			if(it.vertex!=parent){
	            int ret = dfs(u,it.vertex, v, a);
	            a.add(it.weight*ret);
	            cnt+=ret;
	        }
	    }
	    return cnt+1;
	}

}
