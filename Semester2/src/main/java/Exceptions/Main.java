
package Exceptions;

//@author hasin


import java.util.Scanner;
public class Main {
    
    static double result;

    public static void main(String[] args)throws IllegalArgumentInPower, QuitException, IllegalOperation{
    
        Scanner sc=new Scanner(System.in);
        Calculator obj=new Calculator();

        do{
        System.out.println("Choose operations among '+' '-' '*' '/' '^' 'q'");
        obj.operation=sc.next().charAt(0);
        
        if(obj.operation=='+' || obj.operation=='-' || obj.operation=='*' || obj.operation=='/' || obj.operation=='^'){
        System.out.println("Enter value 1 and 2");
        obj.num1=sc.nextDouble();
        obj.num2=sc.nextDouble();}
        else if(obj.operation=='q'){
            try{QuitException q=new QuitException("Program Quitting");
            throw q;
            }
            catch(QuitException e){System.out.println(e.getMessage());}
            }
        else{
            try{IllegalOperation il=new IllegalOperation("Invalid Operation. Please choose among these only : '+' '-' '*' '/' '^' 'q'");
            throw il;}
            catch(IllegalOperation i){System.out.println(i);}
        }
        
        
        
        switch(obj.operation){
        case '+' : result= obj.num1 + obj.num2; System.out.println(result); break;
        case '-' : result= obj.num1 - obj.num2; System.out.println(result); break;
        case '/' : try{result= obj.num1 / obj.num2; System.out.println(result);}catch(ArithmeticException e){System.out.println(e);}break;
        case '*' : result= obj.num1 * obj.num2; System.out.println(result); break;
        case '^' : try{if(obj.num2<0){IllegalArgumentInPower exc=new IllegalArgumentInPower("Power cannot be negative");
        throw exc;}else{result= Math.pow(obj.num1,obj.num2); System.out.println(result);}}catch(Exception e){System.out.println(e);}break;
    }
    }while(obj.operation!='q');
    }

}
