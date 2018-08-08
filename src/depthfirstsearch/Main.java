package depthfirstsearch;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Carlos
 */
public class Main {
    public static void main(String[] args) {
        Vector vertices = new Vector();
        ReaderVertex l = new ReaderVertex("teste.txt", vertices);
        Graph g = new Graph(vertices);
        System.out.println("Vertices");
        g.printVertices();
        g.printAdjacents();
        new DepthFirstSearch(g);
        g.printTimes(); 
    }
}
