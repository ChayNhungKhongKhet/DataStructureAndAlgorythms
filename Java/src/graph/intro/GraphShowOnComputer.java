package graph.intro;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class GraphShowOnComputer {
    static int[][] adjMatrix; //contain adjacency return of function
    static int n; // number of vertex
    static int m; // number of edge
    static Scanner sc = new Scanner(System.in);

    static class Pair {
        int firstVertex;
        int lastVertex;

        public Pair(int firstVertex, int lastVertex) {
            this.firstVertex = firstVertex;
            this.lastVertex = lastVertex;
        }

        public int getFirstVertex() {
            return firstVertex;
        }

        public int getLastVertex() {
            return lastVertex;
        }

    }

    public static void main(String[] args) {
        n = sc.nextInt();
        List<Integer>[] adjList = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
            String str = sc.nextLine();
            str = str.trim();
            String[] st2 = str.split(" ");
            for (int j = 0; j < st2.length; j++)
                adjList[i].add(Integer.parseInt(st2[j]));
        }

        List<Pair> pairList = adjListToEdgeListUndirected(adjList);
        for (Pair p : pairList)
            System.out.println("[" + p.firstVertex + " " + p.lastVertex + "]");

    }

    // Adjacency matrix to Edge list
    public static List<Pair> adjMatrixToEdgeListUndirected(int[][] adjMatrix) {//Directed change j = 1 to length
        List<Pair> pairArray = new ArrayList<>();
        Pair pair;
        for (int i = 1; i < adjMatrix.length; i++) {
            for (int j = i + 1; j < adjMatrix.length; j++) {
                if (adjMatrix[i][j] == 1) {
                    pair = new Pair(i, j);
                    pairArray.add(pair);
                }
            }
        }
        return pairArray;
    }

    // Adjacency matrix to Adjacency list
    public static List<Integer>[] adjMatrixToAdjList(int[][] adjMatrix) {
        List<Integer>[] adjList = new List[adjMatrix.length];
        for (int i = 1; i < adjMatrix.length; i++) {
            adjList[i] = new ArrayList<>();
            for (int j = 1; j < adjMatrix.length; j++) {
                if (adjMatrix[i][j] == 1)
                    adjList[i].add(j);
            }
        }
        return adjList;
    }

    //Edge list to adjacency matrix
    public static int[][] edgeListToAdjMatrixDirected(Pair[] edgeList) {//length of edge list = number of edge
        int[][] adjMatrix = new int[n + 1][n + 1];
        for (Pair pair : edgeList) {
            adjMatrix[pair.firstVertex][pair.lastVertex] = 1;
        }
        return adjMatrix;
    }

    public static List<Integer>[] edgeListToAdjacencyListDirected(Pair[] pairs) {
        List<Integer>[] adjList = new List[n + 1];
        int j = 1;
        for (int i = 1; i <= n; i++) {//vertex i
            adjList[i] = new ArrayList<>();// create new arraylist of element i in adjList
            while (j <= m) {
                if (pairs[j].firstVertex == i) { // add number adjacency vertex with i
                    adjList[i].add(pairs[j].lastVertex);
                    j++; // giu j tai vi tri ma pairs[j] da duoc duyet de khong lap lai nhung canh da duoc duyet tren dinh i
                } else
                    break;
            }
        }
        return adjList;
    }

    public static List<Integer>[] edgeListToAdjacencyListUndirected(Pair[] pairs) {
        List<Integer>[] adjList = new List[n + 1];
        for (int i = 1; i <= n; i++) // vertex i
            adjList[i] = new ArrayList<>();// create new arraylist of element i in adjList
        for (int i = 1; i <= m; i++) { // i is number of element of pair or number of edge
            adjList[pairs[i].firstVertex].add(pairs[i].lastVertex);// get last vertex add into adjList[fistVertex] at pairs[i]
            adjList[pairs[i].lastVertex].add(pairs[i].firstVertex);// opposite
        }
        return adjList;
    }

    public static List<Pair> adjListToEdgeListUndirected(List<Integer>[] adjList) {
        List<Pair> pairs = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int j = 0;

        }
        return pairs;
    }

}
