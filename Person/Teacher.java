
public class Teacher extends Person {

    int numCourses=0;
    String[] courses={};
    
    public Teacher(String name,String address) {
        super(name,address);
    }

    @Override
    public String toString() {
        return "Teacher: " + name + "(" + address + ")";
    }
    
    public boolean addCourse(String course){
        boolean flag=true;
        for(int i=0;i<courses.length;i++){
            if(courses[i].equals(course)){
                flag=false;
            }
        }
        if(flag=true){
        String[] newcourses=new String[courses.length+1];
        if(courses.length>5){
            System.out.println("Course limit full");
            return flag;
        }
        for(int i=0;i<courses.length;i++){
            newcourses[i]=courses[i];
        }
        newcourses[newcourses.length-1]=course;}
        return flag;
    }
    
    public boolean removeCourse(String course){
        boolean flag=false;
        for(int i=0;i<courses.length;i++){
            if(courses[i].equals(course)){
                flag=true;
            }
        }
        if(flag=true){
        String[] newcourses=new String[courses.length-1];
        
        for(int i=0;i<courses.length;i++){
            if(courses[i].equals(course)){
                continue;}
            else{
            newcourses[i]=courses[i];}
        }}
        return flag;
    }
    
    
}
