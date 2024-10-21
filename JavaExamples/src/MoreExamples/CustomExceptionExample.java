package MoreExamples;

import java.util.Arrays;

class MyExceptionClass extends Exception{
    public MyExceptionClass(String excepMsg){
        super(excepMsg);
    }
}
public class CustomExceptionExample {
    public static void main(String[] args) {
        int[]a = {1,2,5};
        int b=11;
        try {
            if(b<18){
                throw new MyExceptionClass("MyException : - Age is less than 18");
            } else {
                System.out.println("Age is valid...");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
