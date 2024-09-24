/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hasin
 */
public class Student {
    String name;
    /**
     * @param args the command line arguments
     */
    Student() {
        name="Unknown";
    }
    
    Student(String val) {
        name=val;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + '}';
    }
    
    
    public static void main(String args[]) {
        // TODO code application logic here
        Student obj1=new Student();
        System.out.println(obj1);
        
        Student obj2=new Student("Wick");
        System.out.println(obj2);
    }
}
