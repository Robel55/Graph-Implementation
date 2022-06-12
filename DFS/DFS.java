
package dfs;

import java.util.Iterator;
import java.util.LinkedList;


public class DFS {
    int V;    
    
LinkedList<Integer> adjList[]; 
DFS(int v)
    {
    V = v;
   adjList = new LinkedList[v];
  for (int i=0; i<v; ++i)
		{
  adjList[i] = new LinkedList();  //it will create empty list for every node
		}
    }
 void addEdgesToGraph(int v, int u)
    {
    adjList[v].add(u);    
    }
 void DFTraversal(int v,int visited[])
    {    
visited[v] = 1;
System.out.print(v + " ");
Iterator<Integer> i = adjList[v].listIterator();
while (i.hasNext())
        {
int n = i.next();
if (visited[n]==0)
    DFTraversal(n, visited);
        }
    }
 void DFSearch(int v)
    {
        
int visited[] = new int[V];
		
DFTraversal(v, visited);
for (int i=1;i<V;i++)
{
if(visited[i]==0)
{
DFTraversal(i, visited);
}
}
  }
 

	}

    

