import java.util.LinkedList;
import java.util.Iterator;

public class BFS {

    static class Graph {
        private int vertices;//how many nodes
        private LinkedList<Integer> ll[];//create space for nodes

        Graph(int value) {
            vertices = value;
            ll = new LinkedList[vertices];//each space will have single linked list

            for (int i = 0; i < vertices; i++) {
                ll[i] = new LinkedList<Integer>();// create single linked list at each space
            }
        }

        void addEdge(int src, int dest) {
            ll[src].add(dest);//connecting nodes or every single linked list
        }

        void bfs(int root) {
            // visted array to keep track certain node is visited or not
            boolean[] visited = new boolean[vertices];
            // keep traversing nodes in a queue
            LinkedList<Integer> queue = new LinkedList<>();

            visited[root] = true;
            queue.add(root);

            while (queue.size() != 0) {

                int s = queue.poll();//pop front item from queue
                System.out.print(s + " ");
                Iterator<Integer> pointer = ll[s].listIterator();

            //traverse all connected nodes of s untill they are added into queue
                while (pointer.hasNext()) {
                    int newNode = pointer.next();
                    if (!visited[newNode]) {
                        visited[newNode] = true;
                        queue.add(newNode);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Graph myGraph = new Graph(4);

        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(2, 0);
        myGraph.addEdge(2, 3);
        myGraph.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " + "from vertex 2 : ");

        myGraph.bfs(2);
    }

}
