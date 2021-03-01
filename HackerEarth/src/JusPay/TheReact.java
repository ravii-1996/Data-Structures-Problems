package JusPay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class TheReact {

	static ArrayList<String> arr= new ArrayList<String>();
    public void print(Graph graph, int start, int end, String path, boolean[] visited){
        String newPath = path + start;
        visited[start] = true;
        LinkedList<Node> list = graph.adjacencyList[start];
        for (int i = 0; i <list.size() ; i++) {
            Node node = list.get(i);
            if(node.destination!=end && visited[node.destination]==false){
//                visited[node.destination] = true;
                print(graph,node.destination,end,newPath,visited);
            }else if(node.destination==end){
            	arr.add(newPath.substring(1));
            }
        }
        //remove from path
        visited[start] = false;
    }

    public void printAllPaths(Graph graph, int start, int end){
        boolean[] visited = new boolean[graph.vertices];
        visited[start] = true;
        print(graph, start, end, "", visited);
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int mem[]= new int[n];
		int mx=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			mem[i]=sc.nextInt();
			if(mx<mem[i])
				mx=mem[i];
		}
		int edge= sc.nextInt();
        Graph graph = new Graph(mx+1);
		for(int i=0;i<edge;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			graph.addEdge(x,y); 
		}
		
		int u = sc.nextInt(); 
		int v = sc.nextInt(); 

        TheReact p = new TheReact();
        p.printAllPaths(graph,u,v);

        int val=-1;
        for(int i=0;i<arr.size();i++) {
        	
        	if(arr.get(i).contains(val+"")) {
           		arr.remove(i);
           		System.out.println(val);
        	}
        	else {
        		int a[] = new int[10];
                for(String s : arr) {
                	for(int j=0;j<s.length();j++) {
                		int x= Integer.valueOf(s.charAt(j)+"");
                		a[x]++;
                	}
                }
                int max=-1;
                for(int j=0;j<a.length;j++) {
                	if(max<a[j]) {
                		max=a[j];
                		val=j;
                	}		
                }
        	}
        }
        
    }
}

class Graph{
    int vertices;
    LinkedList<Node> [] adjacencyList;

    public Graph(int vertices){
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i <vertices; i++) {
            adjacencyList[i] = new LinkedList<Node>();
        }
    }

    public void addEdge(int source, int destination){
        Node node = new Node(source, destination);
        //add edge
        adjacencyList[source].addLast(node);
    }
}

class Node{
    int source;
    int destination;

    public Node(int source, int destination) {
        this.source = source;
        this.destination = destination;
    }
}