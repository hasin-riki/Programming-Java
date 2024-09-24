package NestedDLinkedList;
/**
 *
 * @author Hasin
 */
public class Main{

    public static void main(String[] args){
        
        MovieStore titles=new MovieStore();
        
        MovieStore actorsAvengers=new MovieStore();
        
        actorsAvengers.insert("Robert Downey Jr.");
        actorsAvengers.insert("Chris Evans");
        actorsAvengers.insert("Scarlett Johansson");
        actorsAvengers.insert("Chris Hemsworth");
        
        titles.insert("The Avengers", "2012", actorsAvengers);
        
        System.out.println(titles);
        
        MovieStore actorsBatman=new MovieStore();
        
        actorsBatman.insert("Christian Bale");
        actorsBatman.insert("Cillian Murphy");
        actorsBatman.insert("Katie Holmes");
        actorsBatman.insert("Liam Neeson");
        actorsBatman.insert("Morgan Freeman");
        actorsBatman.insert("Michael Caine");
        
        titles.insert("Batman Begins", "2005", actorsBatman);
        
        System.out.println(titles);
        
        MovieStore actorsInception=new MovieStore();
        
        actorsInception.insert("Leonardo DiCaprio");
        actorsInception.insert("Tom Hardy");
        actorsInception.insert("Cillian Murphy");
        actorsInception.insert("Marian Cotillard");
        
        titles.insert("Inception", "2010", actorsInception);
        System.out.println(titles);
        
        titles.find("Batman Begins");
        
        titles.delete("Batman Begins");
        
        System.out.println(titles);
        
    }
}
