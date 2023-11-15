package com.proftelran.org.lessonfourteen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    private List<List<Integer>> anjacencyList = new ArrayList<>();
    public Graph(List<Edge> edges) {
       int vertex = 0;
       for (Edge edge : edges) {
           vertex = Math.max(vertex, Math.max(edge.getSource(), edge.getDestination()));
       }
       // index 0(source) : list connections for vertex 0 (destinations)

       for (int i = 0; i<= vertex; i++){
           anjacencyList.add(i, new LinkedList<>());
       }

//        edges.add(new Edge(0, 1));
//        edges.add(new Edge(1, 2));
//        edges.add(new Edge(2, 0));
//        edges.add(new Edge(2, 1));
//        edges.add(new Edge(3, 2));

       for (Edge current : edges) {
           //current 0,1;
           //adjacencyList.get(0);
           //adjacencyList : 0, (1);
           //edges.add(new Edge(2,0));
           //adjacencyList.get(2) -> adjacencyList : 2, (0);
           //adjacencyList.get(2) -> adjacencyList : 2, (0,1);

           List<Integer> integerList = anjacencyList.get(current.getSource());
           integerList.add(current.getDestination());
       }
    }


    public List<List<Integer>> getAnjacencyList() {
        return anjacencyList;
    }

    public void setAnjacencyList(List<List<Integer>> anjacencyList) {
        this.anjacencyList = anjacencyList;
    }
    //пример графа - мессенджеры в соцсетях, навигаторы, стратегии в играх
}
