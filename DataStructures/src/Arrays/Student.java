package Arrays;
/**
 *
 * @author Hasin
 */
public class Student implements Comparable<Student>{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int compareTo(Student obj) {
        if(this.age>obj.age){
            return 1;
        }
        else if(this.age<obj.age){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return "Name: " +this.name+" ID: "+this.id + " Age: " + this.age;}
    
}
