package Graph;
/**
 *
 * @author Hasin
 */
public class Graph{
    
    Vertex[] adjList;
    int count;
    
    public Graph(int size){
        adjList=new Vertex[size];
        count=0;
    }
    
    
    public void DFS(Vertex v){
        
        Stack stack=new Stack();
        
        stack.push(v);
        v.flag=true;
        System.out.println(v);
        
        Vertex w;
        while(!stack.isEmpty()){
            for(Node temp=v.friendsList.head; temp!=null; temp=temp.next){
                if(temp.v.flag==false){
                    w=temp.v;
                    stack.push(w);
                    w.flag=true;
                    System.out.println(w);
                }
            }
            v=stack.pop();
        }
    }
    
    public void addVertex(String name, int age){
        Vertex v=new Vertex(name, age);
        
        if(adjList.length==count){
            System.out.println("Adjacent List is Full");
        }
        else{
            for(int i=0; i<adjList.length; i++){
                if(adjList[i]==null){
                    adjList[i]=v;
                    count++;
                    break;}
            }
        }
    }
    
    public void addEdge(String name1, String name2){
        int i;
        int j;
        
        for(i=0; i<count; i++){
            if(adjList[i]!=null && adjList[i].name.equals(name1)){
                break;
            }
        }
        
        for(j=0; j<count; j++){
            if(adjList[j]!=null && adjList[j].name.equals(name2)){
                break;
            }
        }
        
        if(i<count && j<count){
            adjList[i].friendsList.insert(adjList[j]);
            adjList[j].friendsList.insert(adjList[i]);
        }
    }
    
    public void deleteVertex(String name){
        boolean flag=false;
        for(int i=0; i<adjList.length; i++){
            if(adjList[i]!=null && adjList[i].name.equals(name)){
                adjList[i]=null;
                count--;
                flag=true;
            }
        }
        if(flag==true){
            for(int i=0; i<adjList.length; i++){
                if(adjList[i]!=null){
		deleteEdge(adjList[i].name, name);}
            }   
        }
        else{
            System.out.println("Vertex Not Present");
        }
    }
    
    public void deleteEdge(String name1, String name2){
        int i;
        int j;
        
        for(i=0; i<adjList.length; i++){
            if(adjList[i]!=null && adjList[i].name.equals(name1)){
                break;
            }
        }
        
        for(j=0; j<adjList.length; j++){
            if(adjList[j]!=null && adjList[j].name.equals(name2)){
                break;
            }
        }
        
        if(i<count && j<count){
            adjList[i].friendsList.delete(adjList[j]);
            adjList[j].friendsList.delete(adjList[i]);
        }
    }
    
    public Vertex findVertex(String name){
        for(int i=0; i<adjList.length; i++){
            if(adjList[i]!=null && adjList[i].name.equals(name)){
                return adjList[i];
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        String msg="";
        for(int i=0; i<adjList.length; i++){
            msg=msg + "Person: " + adjList[i] + " Friends: " + adjList[i].friendsList + "\n";
        }
        return msg;
    }
}
