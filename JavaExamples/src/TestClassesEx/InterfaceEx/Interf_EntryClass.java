package TestClassesEx.InterfaceEx;

import java.util.Arrays;

/* An interface is declared by using the interface keyword.
It provides total abstraction; means all the methods in an interface are declared with the empty body,
and all the fields are public, static and final by default.
 A class that implements an interface must implement all the methods declared in the interface.
 */
public class Interf_EntryClass {
    public  static  void  main(String[] args){
       Interf_Rectangle r = new Interf_Rectangle();
        r.draw();

        //Bank Interface
        Interf_Bank ban = new Interf_SBI();
        System.out.println("SBI = " + ban.getIntrestRate());

        Interf_Bank banIC = new Interf_ICICI();
        System.out.println("SBI = " + banIC.getIntrestRate());
    }
}
