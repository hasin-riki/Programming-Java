
public class Driver {

    
    public static void main(String args[]) {
        Lawyer obj1=new Lawyer();
        Secretary obj2=new Secretary();
        LegalSecretary obj3=new LegalSecretary();
        
        obj1.vacationDays=obj1.vacationDays+7;
        obj1.vacationForm="Pink";
        
        obj1.sue();
        System.out.println("Lawyer's vacation days " + obj1.getVacationDays());
        System.out.println("Lawyer's vacation form " + obj1.getVacationForm());
        
        
        obj2.takeDictation("Profit this month 25%");
        
        obj3.salary=obj3.salary+5000;
        obj3.fileLegalBriefs();
        System.out.println("Salary of Legal Secretary: " + obj3.getSalary());
    }
}
