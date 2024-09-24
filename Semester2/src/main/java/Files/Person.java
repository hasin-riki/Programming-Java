
package Files;

//@author hasin

import java.io.*;
public class Person implements Serializable{

    String name;
    int age;
    char gender;
    String cnic;

    public Person(String name, int age, char gender, String cnic) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.cnic = cnic;
    }

}
