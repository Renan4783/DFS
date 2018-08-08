package depthfirstsearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author Carlos
 */
public class ReaderVertex {

    private Vector vertices;

    public ReaderVertex(String s, Vector vertexes) {
        try {
            this.vertices = vertexes;

            BufferedReader in = new BufferedReader(new FileReader(s));
            boolean edge = false;
            while (in.ready()) {
                String str = in.readLine();
                if (str.equals("#")) {
                    edge = true;
                } else {
                    if (edge == false) {
                        Vertex v = new Vertex(str);
                        vertexes.add(v);
                    } else {
                        String[] b = str.split(" ");
                        Vertex v = searchVertex(b[0]);
                        Vertex v2 = searchVertex(b[1]);
                        v.addAdjacent(v2);
                    }
                }
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Vertex searchVertex(String s) {
        Vertex aux = new Vertex(null);
        for (Object u : vertices) {
            aux = (Vertex) u;
            if (aux.getName().equals(s)) {
                return aux;
            }
        }
        return null;
    }
}