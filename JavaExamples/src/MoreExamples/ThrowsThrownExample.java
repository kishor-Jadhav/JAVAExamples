package MoreExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ThrowsThrownExample {
    public static void main(String[] args) {
        try {
            System.out.println("Age is = " + checkAge(17));
        }catch (Exception e){
            System.out.println("Exception = " + e.getMessage());
        }

        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }

    }

    public  static  int checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Age is less than 18");
        }else {
            return age;
        }
    }
    // Method declares that it throws IOException
    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
