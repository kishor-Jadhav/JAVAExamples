package TestClassesEx.ArrayEx;

import java.util.Arrays;

public class ArrayEntryClass {
    public  static  void  main(String[] args){
        int a[]=new int[5];
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
        int b[]={1,2,4}; ;//declaration, instantiation and initialization
       // System.out.println("array B = " + b[0]);
        int clonB[] = b.clone();
        for(int i=0;i<b.length;i++){//length is the property of array
            System.out.println(b[i]);
        }

        for(int re: b){
            System.out.println("re "+re);
        }
        String[] c =getArray();
        for(String re: c){
            System.out.println("re "+re);
        }
        System.out.println(String.valueOf(c));
    }
    public static String[] getArray(){
        return new String[]{"A","B"};
    }
    }
