
package Files;

//@author hasin

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IOException{
    
    RoomCounter a=new RoomCounter();
    a.addPerson("Ahad",20,'m',"822-32445");
    a.addPerson("Ali",19,'m',"433-62894");
    a.addPerson("Azhan", 15, 'm', "834-99534");
    a.getPersonCount();
    
    a.removePerson(1);
    a.getPersonCount();
        
    }

}
