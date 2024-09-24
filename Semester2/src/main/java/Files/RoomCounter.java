
package Files;

//@author hasin

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class RoomCounter {

    String filename="file.ser";
    int count=0;
    
    ArrayList objects=new ArrayList();
    
public void addPerson(String a, int b, char c, String d) throws IOException{
    
    Person person=new Person(a,b,c,d);
    objects.add(person);
    try{
    FileOutputStream file=new FileOutputStream(filename);
    ObjectOutputStream out=new ObjectOutputStream(file);
    
    out.writeObject(person);
    
    out.close();
    file.close();
    
    
    count++;}
    catch(IOException e){
        System.out.println("Person not written to file...");
    }
    Person obj=null;
    try{
    FileInputStream file=new FileInputStream("file.ser");
    ObjectInputStream in=new ObjectInputStream(file);
    
    obj=(Person)in.readObject();
    
    in.close();
    file.close();
    
    
    }
    catch(IOException e){
        System.out.println("Person not written to file...");
    }
    catch(ClassNotFoundException f){
        System.out.println("Class not Found...");
    }
    System.out.println("Name : " + obj.name);
    System.out.println("Age : " + obj.age);
    System.out.println("Gender : " + obj.gender);
    System.out.println("Cnic : " + obj.cnic);
}

public void removePerson(int index) throws IOException{

    objects.remove(index);
    try{
    new FileOutputStream(filename).close();
    count=0;}
    catch(IOException e){
        System.out.println("File not Found...");
    }
    
    System.out.println("FILE AFTER REMOVAL OF OBJECT");
    for(int i=0;i<objects.size();i++){
        try{
    FileOutputStream file=new FileOutputStream(filename);
    ObjectOutputStream out=new ObjectOutputStream(file);
    
    out.writeObject(objects.get(i));
    
    out.close();
    file.close();
    
    
    count++;}
    catch(IOException e){
        System.out.println("Person not written to file...");
    }
    Person obj=null;
    try{
    FileInputStream file=new FileInputStream("file.ser");
    ObjectInputStream in=new ObjectInputStream(file);
    
    obj=(Person)in.readObject();
    
    in.close();
    file.close();
    
    
    }
    catch(IOException e){
        System.out.println("Person not written to file...");
    }
    catch(ClassNotFoundException f){
        System.out.println("Class not Found...");
    }
    System.out.println("Name : " + obj.name);
    System.out.println("Age : " + obj.age);
    System.out.println("Gender : " + obj.gender);
    System.out.println("Cnic : " + obj.cnic);
    }
}

public void getPersonCount(){
    
System.out.println("Person Count: " + count);}
}
