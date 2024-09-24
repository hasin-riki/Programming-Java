public class Student extends Person{

    int numCourses=0;
    String courses[]={};
    int[] grades={};

    public Student(String name,String address){
        super(name,address);
    }

    @Override
    public String toString() {
        return "Student: " + name + "(" + address + ")";
    }
    
    int count1=0;
    int count2=0;
    public void addCourseGrade(String course,int grade){
        
        String[] newcourses=new String[courses.length+1];
        if(courses.length>30){
            System.out.println("Course limit full");
            return;
        }
        for(int i=0;i<courses.length;i++){
            newcourses[i]=courses[i];
        }
        newcourses[newcourses.length-1]=course;
        int[] newgrades=new int[grades.length+1];
        
        for(int i=0;i<grades.length;i++){
            newgrades[i]=grades[i];
        }
        newgrades[newgrades.length-1]=grade;
    }
    
    public void printGrades(){
        for(int i=0;i<grades.length;i++){
            System.out.print(grades[i] + " ");
        }
    }
    
    public double getAverageGrade(){
        int sumGrade=0;
        for(int i=0;i<grades.length;i++){
            sumGrade=sumGrade+grades[i];
        }
        int avg=sumGrade/(grades.length+1);
        return avg;
    }
    
    
}