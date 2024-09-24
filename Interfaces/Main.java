
public class Main {

    
    public static void main(String args[]) {
        
        Person person1=new Person();
        PersonInterface obj1=person1;
        System.out.println("Person 1");
        System.out.println("Total Wealth: " + obj1.computeTotalWealth());
        System.out.println("Name: " + obj1.getName());
        
        PersonInterface obj2=new Person(30000,20000,"Private","Ryan");
        System.out.println("Person 2");
        System.out.println("Total Wealth: " + obj2.computeTotalWealth());
        System.out.println("Name: " + obj2.getName());
        boolean b1=(obj2==person1);

    }
}
