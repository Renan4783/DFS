package depthfirstsearch;

import java.util.Vector;

/**
 *
 * @author Carlos
 */
public class DepthFirstSearch {
    private int timeDfs = 0;

    public DepthFirstSearch(Graph g) {
        Vertex aux = new Vertex(null);
        Vector vertices = g.getVertices();
        for (Object i : vertices) {
            aux = (Vertex) i;
            aux.setColor("Branco");
        }

        for (Object u : vertices) {
            aux = (Vertex) u;
            if (aux.getColor().equals("Branco")) {
                dfsVisit(aux);
            }
        }
    }

    private void dfsVisit(Vertex u) {
        Vertex aux = new Vertex(null);
        Vector vector = u.getAdjacents();
        u.setColor("Cinza");
        timeDfs++;
        u.setVi(timeDfs);

        for (Object v : vector) {
            aux = (Vertex) v;
            if (aux.getColor().equals("Branco")) {
                aux.setParent(u.getName());
                dfsVisit(aux);
            }
        }
        u.setColor("Preto");
        timeDfs++;
        u.setVf(timeDfs);
    }
}
