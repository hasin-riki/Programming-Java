package BinarySearchTreeAssignment;
/**
 *
 * @author Hasin
 */
public class MainDictionary{

    public static void main(String[] args){
        
        Dictionary dictionary=new Dictionary();
        
        dictionary.readFile();
        
        dictionary.insert();
        dictionary.insert("A", "An Alphabet in English");
        dictionary.delete("A-");
        
        dictionary.traverse();
        
        System.out.println("Find word 'Fortress': " + dictionary.find("Fortress"));
        dictionary.delete("Fortress");
        System.out.println("Find word 'Fortress' after deletion: " + dictionary.find("Fortress"));
    }
}
