
package dijkstraadjacencymatrix;

import dijkstraadjacencymatrix.DijkstraAdjacencyMatrix.Graph;


public class test {
    public static void main(String[] args) {
 int vertices = 6;
 Graph graph = new Graph(vertices);
 int sourceVertex = 0;
 graph.addEdge(0, 1, 4);
 graph.addEdge(0, 2, 3);
 graph.addEdge(1, 2, 1);
 graph.addEdge(1, 3, 2);
 graph.addEdge(2, 3, 4);
 graph.addEdge(3, 4, 2);
 graph.addEdge(4, 5, 6);
 graph.dijkstra_GetMinDistances(sourceVertex);
 }
    
}
