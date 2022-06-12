

public class test {
   
	public static void main(String[] args) {
		AdjacencyList l=new AdjacencyList(10);
		l.addEdge(0, 2, 10);
		l.addEdge(0, 5, 15);
		l.addEdge(2, 5, 10);
		l.addEdge(9, 3, 16);
		
		System.out.println(l);
		System.out.println(l.isConnected(9,3));
	}
}
