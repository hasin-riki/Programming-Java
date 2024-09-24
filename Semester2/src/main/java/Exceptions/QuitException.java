
package Exceptions;

//@author hasin

public class QuitException extends Exception{

    QuitException(String message){
        super(message);
    }

String message="Progam Quits!";
@Override
public String getMessage(){
    return message;
}
    
}
