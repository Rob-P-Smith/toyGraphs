package graphs;

import java.util.HashMap;
import java.util.Map;

//directed using an unweighted adjacency list
public class MyGraph<V> implements IGraph<V> {
    private Map<V, Node> adjLists = new HashMap<>();
    private int edgeSize;
    private int vertexSize;


    @Override
    public boolean addVertex(V vertex) {
        if (adjLists.containsKey(vertex)) {
            return false;
        }
        adjLists.put(vertex, null);
        vertexSize++;
        return true;
    }

    @Override
    public boolean addEdge(V source, V dest) {
        if(!adjLists.containsKey(source) || !adjLists.containsKey(dest)){
            return false;//vertices not in the map
        }
        if (containsEdge(source, dest)) {
            return false;//edge already exists
        }

        //look up the source in the map and place dest in adjLists
        Node current = adjLists.get(source);
        if(current == null){
            adjLists.put(source, new Node(dest));
        } else {
            Node destNode = new Node(dest);
            destNode.next = current;
            adjLists.put(source, destNode);
        }
        edgeSize++;
        return true;
    }

    @Override
    public boolean containsVertext(V vertex) {
        return false;
    }

    @Override
    public boolean containsEdge(V source, V dest) {
        return false;
    }

    @Override
    public boolean removeVertext(V vertext) {
        return false;
    }

    @Override
    public boolean removeEdge(V source, V dest) {
        return false;
    }

    @Override
    public int vertexSize() {
        return 0;
    }

    @Override
    public int edgeSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    private class Node {
        private V data;
        private Node next;

        public Node(V data) {
            this.data = data;
        }

        @Override
        public String toString() {
            String result = data.toString();
            if(next == null) {
                return result + " | null";
            } else {
                return result + " | " + next.toString();
            }
        }
    }
}
