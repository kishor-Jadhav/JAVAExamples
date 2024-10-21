package MoreExamples;

import java.util.Arrays;

class StudentGen<E>{
    E rollNo;
    E studName;
    StudentGen(E rollNo,E studName){
        this.rollNo = rollNo;
        this.studName = studName;
    }

    @Override
    public String toString() {
        return "StudentGen{" +
                "rollNo=" + rollNo +
                ", studName=" + studName +
                '}';
    }
}
public class GenericClassExample {
    public static void main(String[] args) {
        StudentGen st =new StudentGen(123,"Kishor");
        StudentGen st2 =new StudentGen("2022C1045",555);

        System.out.println("Object 1 = " + st);
        System.out.println("Object 2 = " + st2);
        GenricMethod(10);
        GenricMethod("Kidhor");

        GenricBoundMethod(10);
        //GenricBoundMethod("Kidhor"); // This is not run because this string
        GenricBoundMethod(10.5);
    }

    public static <E> void GenricMethod(E data){
        System.out.println("data = " + data);
    }

    //Bounded Generic
    public static <E extends Number> void GenricBoundMethod(E data){
        System.out.println("data = " + data);
    }
}
