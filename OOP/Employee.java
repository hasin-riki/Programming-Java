
public class Employee {

   private int cnic;
   private String name;
   private int salary;

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getCnic() {
        return cnic;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Employee() {
        System.out.println("No argument constructor called");
    }

    public Employee(int cnic, String name) {
        this.setCnic(cnic);
        this.setName(name);
    }

    public Employee(int cnic, String name, int salary) {
        this(cnic,name);
        this.setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "cnic=" + cnic + ", name=" + name + ", salary=" + salary + '}';
    }
    
}
