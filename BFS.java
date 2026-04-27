import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public BFS(int v) {
        vertices = v;
        adjList = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge
    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // BFS Traversal
    void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int adjVertex : adjList[vertex]) {
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        BFS graph = new BFS(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        System.out.println("BFS Traversal starting from vertex 0:");
        graph.BFS(0);
    }
}