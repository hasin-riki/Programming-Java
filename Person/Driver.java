
public class Driver {

    
    public static void main(String args[]) {
        Student obj1=new Student("Jack","Bourban 6th Street");
        Teacher obj2=new Teacher("John", "Black Toddle Street");
        
        obj1.addCourseGrade("maths",90);
        obj1.printGrades();
        System.out.println(obj1.getAverageGrade());
        
        System.out.println(obj2.addCourse("maths"));
        System.out.println(obj2.removeCourse("english"));
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
