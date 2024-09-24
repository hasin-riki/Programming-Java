package Graph;
/**
 *
 * @author Hasin
 */
public class Main{
    
    public static void main(String[] args){
        
        Graph graph=new Graph(5);
        
        graph.addVertex("Tom", 17);
        graph.addVertex("Damon", 20);
        graph.addVertex("Grant", 25);
        graph.addVertex("Sawyer", 16);
        graph.addVertex("Bill", 19);
        graph.addVertex("Mark", 20);
        
        graph.deleteVertex("Damon");
        graph.addVertex("Brown", 18);
        
        graph.addEdge("Tom", "Grant");
        graph.addEdge("Grant", "Sawyer");
        graph.addEdge("Bill", "Tom");
        graph.addEdge("Bill", "Mark");
        graph.addEdge("Brown", "Tom");
        
        //graph.deleteEdge("Tom", "Bill");
        
        System.out.println(graph);
        
        System.out.println("Find Damon: " + graph.findVertex("Damon"));
        System.out.println("Find Grant: " + graph.findVertex("Grant"));
        System.out.println();
        
        graph.DFS(graph.adjList[0]);
    }
}
