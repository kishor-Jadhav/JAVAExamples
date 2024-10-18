package TestClassesEx.PolymorphismEx;

import java.util.Arrays;
import java.util.Base64;

public class Poly_Entry {
    public  static  void  main(String[] args){
        //overloading
        Poly_ClassAdd.add(2,5);
        System.out.println("two = " + Poly_ClassAdd.add(2,5));
        Poly_ClassAdd.add(5,2,6);
        System.out.println("three = " + Poly_ClassAdd.add(5,2,6));
        System.out.println(Poly_ClassAdd.add(12.3,12.6));

// Run time polymorphism
        Poly_Bank b;
        b = new Poly_SBI();
        System.out.println("SBI = " + b.getIntrestRate());

        b = new Poly_ICICI();
        System.out.println("ICICI = " + b.getIntrestRate());

        b = new Poly_YesBank();
        System.out.println("Yes Bank = " + b.getIntrestRate());
    }
}
