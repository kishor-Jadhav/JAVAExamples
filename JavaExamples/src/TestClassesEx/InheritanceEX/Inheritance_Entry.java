package TestClassesEx.InheritanceEX;

import java.util.Arrays;

public class Inheritance_Entry extends  Inheri_ClassEmp {
    public static void main(String[] args){
        Inheritance_Entry inEn = new Inheritance_Entry();
        System.out.println("salary = " + inEn.empSalary);
        // cat -> dog
        Inheri_Cat incat = new Inheri_Cat();
         incat.printDog();
         incat.msg();
    }
}
