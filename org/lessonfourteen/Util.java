package com.proftelran.org.lessonfourteen;

public class Util {

 public static void printGraph(Graph graph) {
    int source = 0;
    int size = graph.getAnjacencyList().size();

    if (source < size) {
        do {
            for (int dest : graph.getAnjacencyList().get(source)) {
                System.out.print("[" + source + " -> " + dest + "]");
            }
            System.out.println();
            source++;

        } while (source < size);
    }
 }

}
