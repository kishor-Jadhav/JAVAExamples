package MoreExamples;

import java.util.Arrays;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        int a=10;
        //Autoboxing
        Integer aOb = a;
        System.out.println("Integer Ob: = " + aOb);

        //Unboxing
        int b = aOb;
        System.out.println("int = " + b);
    }

}
