package NestedDLinkedList;
/**
 *
 * @author Hasin
 */
public class Node{
    String title;
    String year;
    String actor;
    MovieStore castList;
    ModifiedMovieStore castList2;
    Node next;
    Node prev;
    
    public Node(String actor){
        this.actor=actor;
    }

    public Node(String title, String year, MovieStore castList){
        this.title = title;
        this.year = year;
        this.castList = castList;
    }

    public Node(String title, String year, ModifiedMovieStore castList2){
        this.title = title;
        this.year = year;
        this.castList2 = castList2;
    }
    
    
}
