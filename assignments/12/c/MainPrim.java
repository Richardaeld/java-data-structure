// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 12-Part-1-Prims
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


    //    Check if an edge has been visited
    public static boolean bParsedEdges (boolean[] bVisited) {
        for (boolean bool: bVisited) if (!bool) return false;
        return true;
    }


    //    Check if all edges have been visited
    public static boolean bVisitedEdge (ArrayList<Integer> nVisited, int edge) {
        for (int num : nVisited) if (num == edge) return false;
        return true;
    }


    //    Method to run prims algorithm
    public static void prim(ArrayList<WeightedEdge> edges, int totalVertex, int startVertex) {
        String[] aLegend = {"A","B","C","D","E","F","G","H"};

//        Create visited array and set as false; caveat 0 is visited
        boolean[] bVisited = new boolean[totalVertex];
        for (int i = 0; i < bVisited.length; i++) bVisited[i] = false;
        bVisited[startVertex] = true;

        System.out.println("Starting Vertex: " + aLegend[startVertex]);


//        Create order visited array
        ArrayList<Integer> nVisited = new ArrayList<>();
        nVisited.add(startVertex);

//        Set default total visited weight and legend
        int totalWeight = 0;
        WeightedEdge nextEdgeNode= null;

        while(!WeightedGraphs.bParsedEdges(bVisited)) {
            int nextEdge = -1,
                nextWeight = Integer.MAX_VALUE;

//            Iterate over all edges and find the next node to visit
            for (WeightedEdge edge: edges) {
                if (edge .weight.weight == null) continue;
                if (bVisitedEdge(nVisited, edge.x) && !bVisitedEdge(nVisited, edge.y) && edge.weight.weight < nextWeight) {
                    nextWeight   = edge.weight.weight;
                    nextEdge     = edge.x;
                    nextEdgeNode = edge;
                }
            }

//            Set for next iteration and found edges / weight
            bVisited[nextEdge] = true;
            nVisited.add(nextEdge);
            totalWeight += nextWeight;
//            System.out.println("Edge: " + aLegend[nextEdge] + " Weight: " + nextWeight);
            System.out.println("Edge: " + aLegend[nextEdgeNode.y] + "-" + aLegend[nextEdgeNode.x] + " Vertex: " + aLegend[nextEdge] + " Weight: " + nextWeight);
        }

//        Print out total weight and visited order
        System.out.println();
        WeightedGraphs.visitOrder(nVisited);
        System.out.println("Total Weight: " + totalWeight);
    }

}


public class MainPrim {
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


//        Display results of Prim algorithm
        WeightedGraphs.prim(edges, 8, 0);

    }
}
