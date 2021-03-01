package PCO12020;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap; 
class LovePolygon { 
	int V; 
	LinkedList<Integer>[] adjListArray; 
	static TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<Integer, ArrayList<Integer>>();
	static int temp=0;
	// constructor 
	LovePolygon(int V) { 
		this.V = V; 

		adjListArray = new LinkedList[V]; 

		for(int i = 0; i < V ; i++){ 
			adjListArray[i] = new LinkedList<Integer>(); 
		} 
	} 
	
	// Adds an edge to an undirected graph 
	void addEdge( int src, int dest) { 
		// Add an edge from src to dest. 
		adjListArray[src].add(dest); 

		// Since graph is undirected, add an edge from dest 
		// to src also 
		adjListArray[dest].add(src); 
	} 
	
	void DFSUtil(int v, boolean[] visited) { 
		// Mark the current node as visited and print it 
		visited[v] = true; 
		System.out.print(v+" "); 
		tm.get(temp).add(v);
		// Recur for all the vertices 
		// adjacent to this vertex 
		for (int x : adjListArray[v]) { 
			if(!visited[x]) DFSUtil(x,visited); 
		} 

	} 
	void connectedComponents() { 
		// Mark all the vertices as not visited 
		boolean[] visited = new boolean[V]; 
		
		for(int v = 0; v < V; ++v) { 
			temp++;
			if(!visited[v]) { 
				// print all reachable vertices 
				// from v 
				DFSUtil(v,visited); 
				System.out.println(); 
			} 
		} 
	} 
	
	
	// Driver program to test above 
	public static void main(String[] args){ 
		// Create a graph given in the above diagram
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n= sc.nextInt();
			LovePolygon g = new LovePolygon(n); // 5 vertices numbered from 0 to 4
			
			int k= sc.nextInt();
			for(int i=0;i<k;i++) {
				g.addEdge(sc.nextInt(), sc.nextInt());
			}
			g.connectedComponents(); 
		}
		System.out.println(tm.size()+ "  "+ temp );
	} 
}	 
