package TestClassesEx.AbstractEx;

import java.util.Arrays;

/* A class which is declared with the abstract keyword is known as
an abstract class in Java.
It can have abstract and non-abstract methods (method with the body).
Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 */
public class Abst_EntryClass {
    public  static  void main(String[] args){
    Abst_BankClass b = new Abst_SBI();
        System.out.println("SBI = " + b.getInterest());
    }
}
