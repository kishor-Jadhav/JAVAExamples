package TestClassesEx.EncapsulationEx;

import java.util.Arrays;
// getter setter method hiding with private
public class Encap_EntryClass {
    public  static  void  main(String[] args){
        Encap_Account en =new Encap_Account();
        en.setAccName("ABC");
        System.out.println("acc name = " + en.getAccName());
    }
}
