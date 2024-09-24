
public class Employee {

    private String name;
    private String address;
    private int salary;
    
    Employee(){
        this("John");
    }
    
    Employee(String val){
        this("John",20000);
        name=val;
    }
    
    Employee(String name,int val){
        this("John",20000,"Street-4, Bulovick Town");
        salary=val;
    }
    
    Employee(String name,int salary,String val){
        address=val;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", address=" + address + ", salary=" + salary + '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }
    
    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + getSalary());
    }
    
    public static void main(String args[]) {
        Employee obj=new Employee();
        obj.display();
    }
}
