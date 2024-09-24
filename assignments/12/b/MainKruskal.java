// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 12-ExtraCredit-1-Kruskal
// IDE:        IntelliJ IDEA Edu

import java.util.*;

// Weight Node for determining weight or null
class Weight {
    public Integer weight;
    Weight (Integer x) { weight = x; }
}

// Determines an edge and gives it a weight
class WeightedEdge {
    public Weight weight;
    public int x,
               y;

    public WeightedEdge(int x, int y, Integer weight) {
        this.x = x;
        this.y = y;
        this.weight = new Weight(weight);
    }

}

class WeightedGraphs {
    //    Print out a visual block that show the full weighted graph
    public static void printWeightedGraph (ArrayList<WeightedEdge> edges) {
        int x = 0,
            y = 0;

        for (WeightedEdge edge: edges) {
            if (edge.x != x) {
                x = edge.x;
                System.out.println();
            }
            System.out.print("["+edge.x + ", " + edge.y + ", " + (edge.weight.weight == null ? edge.weight.weight : "   "+edge.weight.weight) + "]");
        }
    }


    //    Print out a visual block that shows the Adjacency matrix
    public static void printAdjMatrix (ArrayList<WeightedEdge> edges) {
        int x = 0,
            y = 0;

        for (WeightedEdge edge: edges) {
            if (edge.x != x) {
                x = edge.x;
                System.out.println();
            }
            System.out.print((edge.weight.weight == null ? edge.weight.weight+" " : "   "+edge.weight.weight+" "));
        }
    }


    //    Prints out the order in which edges were visited
    public static void visitOrder (ArrayList<Integer> nVisited) {
        String[] aLegend = {"A","B","C","D","E","F","G","H"};

        System.out.print("Adjacency Matrix visited in order: " );
        for (int num: nVisited) System.out.print(aLegend[num] + " ");
        System.out.println();
    }


    //    Sort ArrayList edges by weight and return new array
    public static ArrayList<WeightedEdge> sortByWeight (ArrayList<WeightedEdge> edges) {
        ArrayList<WeightedEdge> newEdges = new ArrayList<>();

//        Loop through all of edges until only nulls remain and then dumpall into new array and return
        while (edges.size() > 0) {
            int weight = Integer.MAX_VALUE;
            WeightedEdge migrate = null;
//            find smallest weight
            for (WeightedEdge edge: edges) {
                if (edge.weight.weight != null && edge.weight.weight < weight) {
                    weight = edge.weight.weight;
                    migrate = edge;
                }
            }

//            Dump entire rest of edges into new array b/c inly null remain
            if (migrate == null) {
                for (WeightedEdge edge: edges) newEdges.add(edge);
                edges.clear();
                break;
            }

//            Migrate and remove lowest weight edge
            newEdges.add(migrate);
            edges.remove(migrate);
        }
        return newEdges;
    }


    //    Recursive search to find if tree is sparse or multiple trees
    private static int find(int[] parent, int x) {
        if (parent[x] != x) parent[x] = find(parent, parent[x]);
        return parent[x];
    }


    public static void kruskal(ArrayList<WeightedEdge> edges, int totalEdges) {
//        Sort edges by weight
        edges = sortByWeight(edges);

//        Verticies have no parents to start (set to self)
        int[] parent = new int[totalEdges];
        for (int i = 0; i < totalEdges; i++) parent[i] = i;

//        Set inital variables
        int totalWeight = 0;
        ArrayList<Integer> nVisited = new ArrayList<>();
        String[] aLegend = {"A","B","C","D","E","F","G","H"};


//        Iterate over all edges and find the next node to visit
        System.out.println("Edges visited in order of: ");
        for (WeightedEdge edge : edges) {
//            Search for parent roots for both x and y
            int rootX = find(parent, edge.x);
            int rootY = find(parent, edge.y);

//            If the roots dont match then these are multiple sparse trees and can be connected
            if (rootX != rootY) {
                parent[rootX] = rootY;
                totalWeight += edge.weight.weight;
                nVisited.add(edge.x);
                nVisited.add(edge.y);
                System.out.println("Edge: " + aLegend[edge.x] + "-" + aLegend[edge.y] + ", Weight: " + edge.weight.weight);
            }
        }

        System.out.println("Total Weight: " + totalWeight);
//        visitOrder(nVisited);
    }

}

public class MainKruskal {
    public static void main(String[] args) {
//        Adjacency matrix
        Integer[][] matrix = {
            {null, null,    4, null, null,    7, null, null},
            {null, null, null, null,    9, null, null,    3},
            {   4, null, null,    3, null,    2,    9, null},
            {null, null,    3, null,    3, null,    7, null},
            {null,    9, null,    3, null, null,    2,    7},
            {   7, null,    2, null, null, null,    8, null},
            {null, null,    9,    7,    2,    8, null,    3},
            {null, null,    3, null,    7, null,    3, null},
        };

//        Create ArrayList of Weighted edges with adjacency matrix
        ArrayList<WeightedEdge> edges = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                edges.add(new WeightedEdge(i, j, matrix[i][j]));
            }
        }


//        WeightedGraphs.printWeightedGraph(edges);
//        System.out.println("\n\n");
//        WeightedGraphs.printAdjMatrix(edges);
//        System.out.println("\n\n");


//        Display results of Kruskal algorithm
        WeightedGraphs.kruskal(edges, 8);

    }
}
