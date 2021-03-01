package JusPay;
import java.io.*; 
import java.util.*; 

public class Que2 
{ 
	static final int INFINITY=Integer.MAX_VALUE; 
	class AdjNode 
	{ 
		private int v; 
		private int weight; 
		AdjNode(int v, int w) { this.v = v; this.weight = w; } 
		int getV() { return v; } 
		int getWeight() { return weight; } 
	} 

	class Graph 
	{ 
		private int V; 
		private LinkedList<AdjNode>adj[]; 
		Graph(int v) 
		{ 
			V=v; 
			adj = new LinkedList[V]; 
			for (int i=0; i<v; ++i) 
				adj[i] = new LinkedList<AdjNode>(); 
		} 
		void addEdge(int u, int v, int weight) 
		{ 
			AdjNode node = new AdjNode(v,weight); 
			adj[u].add(node);
		} 
		void sort(int v, Boolean visited[], Stack stack) 
		{ 
			visited[v] = true; 
			Integer i; 
			Iterator<AdjNode> it = adj[v].iterator(); 
			while (it.hasNext()) 
			{ 
				AdjNode node =it.next(); 
				if (!visited[node.getV()]) 
					sort(node.getV(), visited, stack); 
			} 
			stack.push(new Integer(v)); 
		}  
		void shortestPath(int s, int t) 
		{ 
			Stack stack = new Stack(); 
			int dist[] = new int[V]; 

			Boolean visited[] = new Boolean[V]; 
			for (int i = 0; i < V; i++) 
				visited[i] = false; 
			for (int i = 0; i < V; i++) 
				if (visited[i] == false) 
					sort(i, visited, stack);
			for (int i = 0; i < V; i++) 
				dist[i] = INFINITY; 
			dist[s] = 0; 

			while (stack.empty() == false) 
			{ 
				int u = (int)stack.pop(); 

				Iterator<AdjNode> it; 
				if (dist[u] != INFINITY) 
				{ 
					it = adj[u].iterator(); 
					while (it.hasNext()) 
					{ 
						AdjNode i= it.next(); 
						if (dist[i.getV()] > dist[u] + i.getWeight()) 
							dist[i.getV()] = dist[u] + i.getWeight(); 
					} 
				} 
			} 
			
			if(dist[t]!=INFINITY)
				System.out.print( dist[t]);
		} 
	} 

	Graph newGraph(int number) 
	{ 
		return new Graph(number); 
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
		int edge= sc.nextInt();
		Que2 ques1 = new Que2(); 
		Graph g = ques1.newGraph(max+1); 
		
		for(int i=0;i<edge;i++) {
			g.addEdge(sc.nextInt(),sc.nextInt(),sc.nextInt()); 
		}
		
		int u = sc.nextInt(); 
		int v = sc.nextInt();
		g.shortestPath(u,v); 
		int count=0;
		for(int i=0;i<n;i++){
			if(max!=count)
				count++;
		}
			
	} 
}
