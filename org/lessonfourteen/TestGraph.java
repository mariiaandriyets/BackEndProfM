package com.proftelran.org.lessonfourteen;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TestGraph {
    public static void main(String[] args) {

        ArrayList<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1));
        edges.add(new Edge(1, 2));
        edges.add(new Edge(2, 0));
        edges.add(new Edge(2, 1));
        edges.add(new Edge(3, 2));

        Graph graph = new Graph(edges);

      Util.printGraph(graph);


    }


}
