/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

/**
 *
 * @author Robel
 */
public class test {
    public static void main(String args[])
{
   DFS dfs = new DFS(10);
        
dfs.addEdgesToGraph(1,2);
dfs.addEdgesToGraph(1,4);
dfs.addEdgesToGraph(2,5);
dfs.addEdgesToGraph(2,6);
dfs.addEdgesToGraph(4,7);
dfs.addEdgesToGraph(4,8);
dfs.addEdgesToGraph(3,9);
dfs.addEdgesToGraph(3,4);
dfs.addEdgesToGraph(4,3);
        
 dfs.DFSearch(1);
    }
    
}
