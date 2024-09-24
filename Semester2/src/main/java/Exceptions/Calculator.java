
package Exceptions;

//@author hasin

public class Calculator {

    public Calculator() {
    }

    public Calculator(double num1, double num2, char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }
    
    public Calculator(char operation, double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }
    
    double num1;
    double num2;
    char operation;
    
    
    

}
