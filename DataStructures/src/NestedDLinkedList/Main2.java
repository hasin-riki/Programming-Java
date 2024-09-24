package NestedDLinkedList;
/**
 *
 * @author Hasin
 */
public class Main2{

    public static void main(String[] args){
        
        ModifiedMovieStore titles=new ModifiedMovieStore();
        
        ModifiedMovieStore actorsAvengers=new ModifiedMovieStore();
        
        actorsAvengers.insert("Robert Downey Jr.");
        actorsAvengers.insert("Chris Evans");
        actorsAvengers.insert("Scarlett Johansson");
        actorsAvengers.insert("Chris Hemsworth");
        
        titles.insert("The Avengers", "2012", actorsAvengers);
        
        ModifiedMovieStore actorsShawshankRedemption=new ModifiedMovieStore();
        
        actorsShawshankRedemption.insert("Tim Robbins");
        actorsShawshankRedemption.insert("Morgan Freeman");
        actorsShawshankRedemption.insert("James Whitmore");
        
        titles.insert("The Shawshank Redemption", "1994", actorsShawshankRedemption);
        
        ModifiedMovieStore actorsBatman=new ModifiedMovieStore();
        
        actorsBatman.insert("Christian Bale");
        actorsBatman.insert("Cillian Murphy");
        actorsBatman.insert("Katie Holmes");
        actorsBatman.insert("Liam Neeson");
        actorsBatman.insert("Morgan Freeman");
        actorsBatman.insert("Michael Caine");
        
        titles.insert("Batman Begins", "2005", actorsBatman);
        
        ModifiedMovieStore actorsBatman2=new ModifiedMovieStore();
        
        actorsBatman2.insert("Christian Bale");
        actorsBatman2.insert("Heath Ledger");
        actorsBatman2.insert("Gary Oldman");
        actorsBatman2.insert("Anne Hathaway");
        actorsBatman2.insert("Morgan Freeman");
        actorsBatman2.insert("Michael Caine");
        
        titles.insert("Batman: Dark Knight", "2008", actorsBatman2);
        
        ModifiedMovieStore actorsInception=new ModifiedMovieStore();
        
        actorsInception.insert("Leonardo DiCaprio");
        actorsInception.insert("Tom Hardy");
        actorsInception.insert("Cillian Murphy");
        actorsInception.insert("Marian Cotillard");
        
        titles.insert("Inception", "2010", actorsInception);
        
        ModifiedMovieStore actorsAvatar=new ModifiedMovieStore();
        
        actorsAvatar.insert("Zoe Saldana");
        actorsAvatar.insert("Sam Worthington");
        actorsAvatar.insert("Michelle Rodriguez");
        actorsAvatar.insert("Sigourney Weaver");
        
        titles.insert("Avatar", "2009", actorsAvatar);
        
        titles.find("Batman Begins");
        titles.delete("Batman Begins");
        
        System.out.println(titles);
        
        
        
    }
}
