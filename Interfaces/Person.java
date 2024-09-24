
public class Person implements PersonInterface{

    private int cashSaving;
    private int retirementFund;
    private String firstName;
    private String lastName;

    public Person() {
        cashSaving=100000;
        retirementFund=20000;
        firstName="John";
        lastName="Wick";
    }
    
    public Person(int cashSaving, int retirementFund, String firstName, String lastName) {
        this.cashSaving = cashSaving;
        this.retirementFund = retirementFund;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public int computeTotalWealth(){
        int totalWealth=this.cashSaving + this.retirementFund;
        return totalWealth;
    }
    
    public String getName(){
        String name=this.firstName+ " " + this.lastName;
        return name;
    }
}
