package JusPay; 
import java.util.*; 
import java.util.LinkedList;

public class Ques1 
{ 
	public int V;
	public LinkedList<Integer> adjList[];

	Ques1(int v) 
	{ 
		V = v; 
		adjList = new LinkedList[v]; 
		for (int i=0; i<v; i++) 
			adjList[i] = new LinkedList(); 
	} 
	void addEdge(int v,int w) { adjList[v].add(w); } 

	Boolean isReachable(int src, int des) 
	{ 
		LinkedList<Integer>temp; 

		boolean visited[] = new boolean[V]; 
		LinkedList<Integer> queues = new LinkedList<Integer>(); 
		
		visited[src]=true; 
		queues.add(src); 
		Iterator<Integer> i; 
		while (queues.size()!=0) 
		{ 
			src = queues.poll(); 
			int n; 
			i = adjList[src].listIterator(); 
			while (i.hasNext()) 
			{ 
				n = i.next(); 
				if (n==des) 
					return true; 
				if (!visited[n]) { 
					visited[n] = true; 
					queues.add(n); 
				} 
			} 
		} 
		return false; 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int member[]= new int[n];
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			member[i]=sc.nextInt();
			if(max<member[i])
				max=member[i];
		}
		
		int e= sc.nextInt();
		Ques1 g = new Ques1(max+1); 
		
		for(int i=0;i<e;i++) {
			g.addEdge(sc.nextInt(),sc.nextInt()); 
		}
		boolean flag=true;
		int u = sc.nextInt(); 
		int v = sc.nextInt();
		
		flag=g.isReachable(u, v);
		if (flag) 
			System.out.println(1); 
		else
			System.out.println(0);
		int count=0;
		for(int i=0;i<e;i++){
			if(max!=count)
				count++;
		}
	} 
}
