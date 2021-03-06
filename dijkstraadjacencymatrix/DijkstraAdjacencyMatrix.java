
package dijkstraadjacencymatrix;


public class DijkstraAdjacencyMatrix {
static class Graph{
 int vertices;
 int matrix[][];

 public Graph(int vertex) {
 this.vertices = vertex;
 matrix = new int[vertex][vertex];
 }

 public void addEdge(int source, int destination, int weight) {
 
 matrix[source][destination]=weight;
 matrix[destination][source] = weight;
 }
   int getMinimumVertex(boolean [] mst, int [] key){
   int minKey = Integer.MAX_VALUE;
   int vertex = 0;
   
      for (int i = 0; i <vertices ; i++) {
      if(mst[i]==false && minKey>key[i]){
       minKey = key[i];
        vertex = i;
 }
 }
      return vertex;
 }

 public void dijkstra_GetMinDistances(int sourceVertex){
 boolean[] spt = new boolean[vertices];
 int [] distance = new int[vertices];
 int INFINITY = Integer.MAX_VALUE;
     for (int i = 0; i <vertices ; i++) {
         
 distance[i] = INFINITY;
 }

 //start from the vertex 0
 distance[sourceVertex] = 0;

      for (int i = 0; i <vertices ; i++) {
  int vertex_U = getMinimumVertex(spt, distance);
 spt[vertex_U] = true;
      for (int vertex_V = 0; vertex_V <vertices ; vertex_V++) {
        if(matrix[vertex_U][vertex_V]>0){
          if(spt[vertex_V]==false && matrix[vertex_U][vertex_V]!=INFINITY){
int newKey = matrix[vertex_U][vertex_V] + distance[vertex_U];
         if(newKey<distance[vertex_V])
 distance[vertex_V] = newKey;
 }
 }
 }
 }
      printDijkstra(sourceVertex, distance);
 }
public void printDijkstra(int sourceVertex, int [] key){
System.out.println("Dijkstra Algorithm: (Adjacency Matrix)");
    for (int i = 0; i <vertices ; i++) {
        System.out.println("Source Vertex: " + sourceVertex + " to vertex " + + i +
 " distance: " + key[i]);
  }
}
}
}

   
   
    
    

