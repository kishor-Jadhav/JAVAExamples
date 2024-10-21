package MoreExamples;

import java.util.Arrays;

public class ExceptionExample {
    public static void main(String[] args) {
        int[] a ={1,2,3};
        System.out.println("Statement 1 ");
        try{
            System.out.println(a[6]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arithmatic Exaception = " + e);

        } finally {
            System.out.println("Finally ");
            System.out.println(a[6]);

        }
        System.out.println("Statement 2 ");
    }

}
