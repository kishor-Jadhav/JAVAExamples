package MoreExamples;

import java.util.Arrays;

@FunctionalInterface
interface MessageInterface{

    // Single abstract method
    void displayMessage(String message);

    // You can have default or static methods
    public default String getMessage(){
        return "Print Mesg";
    }
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
@FunctionalInterface
interface OperationFunctionalInterface{
    public int addition(int a, int b);
    public default int multiplication(int a, int b){
        return a*b;
    }
    static int substaraction(int a, int b){
        return a-b;
    }
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MessageInterface msgInf =(mess)->{
            System.out.println("Functional msg = " + mess);
        };

        msgInf.displayMessage("Hi");
        msgInf.getMessage();
        MessageInterface.staticMethod();

        //-----------------------------Operations------------
        OperationFunctionalInterface opInt =(a,b)->{
            return a+b;
        };
        //Or
        OperationFunctionalInterface opInt2 =(a,b)-> a+b;

        System.out.println("Addition = " + opInt.addition(5,6));
        System.out.println("Multiplication = " + opInt.multiplication(5,6));
        System.out.println("Substaction = " + OperationFunctionalInterface.substaraction(10,5));

    }
}
