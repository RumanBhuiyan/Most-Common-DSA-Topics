import java.util.*;

public class DFS {

    static class Graph {

        private int vertices;
        private LinkedList<Integer> ll[];
        private boolean visited[];

        // Graph creation
        Graph(int value) {
            vertices = value;
            ll = new LinkedList[vertices];
            visited = new boolean[vertices];

            for (int i = 0; i < vertices; i++)
                ll[i] = new LinkedList<Integer>();
        }

        // Add edges
        void addEdge(int src, int dest) {
            ll[src].add(dest);
        }

        // DFS algorithm
        void dfs(int vertex) {
            visited[vertex] = true;
            System.out.print(vertex + " ");

            Iterator<Integer> pointer = ll[vertex].listIterator();
            while (pointer.hasNext()) {
                int newNode = pointer.next();
                if (!visited[newNode])
                    dfs(newNode);
            }
        }
    }

    public static void main(String args[]) {
        Graph myGraph = new Graph(4);

        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(2, 3);

        System.out.print("Following is Depth First Traversal: ");

        myGraph.dfs(2);
    }
}
