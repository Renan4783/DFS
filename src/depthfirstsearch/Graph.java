package depthfirstsearch;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
/**
 *
 * @author Carlos
 */
public class Graph {    
    private Vector vertices = new Vector();
    
    public Graph(Vector v) {
        this.vertices = v;
    }
    
    public Vector getVertices() {
        return vertices;
    }

    public void printVertices(){
        Vertex aux = new Vertex(null);
        for (Object u : vertices) {
            aux = (Vertex) u;
            System.out.println(aux.getName());
        }
    }
    
    public Vector getAdjacents(Vertex v){
        return v.getAdjacents();
    }
    
    public void printAdjacents(){
        Vertex aux = new Vertex(null);
        Vertex aux2 = new Vertex(null);
        
        for (Object u : vertices) {
            aux = (Vertex) u;
            System.out.print(aux.getName()+" | ");
            Vector list = aux.getAdjacents();
            for (Object v : list) {
                aux2 = (Vertex) v;
                System.out.print(" -> "+aux2.getName());
            }
            System.out.println();
        }
    }
    
    public void printTimes(){
        Vertex aux = new Vertex(null);
        for (Object u : vertices) {
            aux = (Vertex) u;
            System.out.println();
            System.out.println("-----------"+aux.getName()+"-------------------");
            System.out.println("Nome: "+aux.getName());
            System.out.println("Cor: "+aux.getColor());
            System.out.println("Pai: "+aux.getParent());
            System.out.println("Tempo de descoberta: "+aux.getVi());
            System.out.println("Tempo de finalização: "+aux.getVf());
        }
    }  
}
