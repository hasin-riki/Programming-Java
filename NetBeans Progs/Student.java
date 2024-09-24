
public class Student {
    String name;
    
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
