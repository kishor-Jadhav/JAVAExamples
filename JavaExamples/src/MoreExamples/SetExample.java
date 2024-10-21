package MoreExamples;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class StudentSetClass{
    int rollNo;
    String studentName;
    LocalDate birthdate;
    StudentSetClass(int rollNo,String studentName,LocalDate birthdate){
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.birthdate = birthdate;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudentSetClass that = (StudentSetClass) obj;
        return rollNo == that.rollNo && Objects.equals(studentName, that.studentName);
    }
    @Override
    public String toString() {
        return "StudentListClass{" +
                "rollNo=" + rollNo +
                ", studentName='" + studentName + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
public class SetExample {
    public static void main(String[] args) {
        HashSet();
        TreeSet();
        HashSetClass();
        TreeSetClass();
    }

    public static void HashSetClass() {
    Set<StudentSetClass> set1 = new HashSet<>();
        StudentSetClass st = new StudentSetClass(12,"Ram",LocalDate.of(2000, 1, 15));
        StudentSetClass st2 = new StudentSetClass(123,"xyz",LocalDate.of(1998, 5, 20));

        set1.add(st);
        set1.add(st2);

        System.out.println("Initial HashSet Class:-" +set1);
    }

    public static void TreeSetClass() {
        Set<StudentSetClass> set1 = new TreeSet<>();
        StudentSetClass st = new StudentSetClass(12,"Ram",LocalDate.of(2000, 1, 15));
        StudentSetClass st2 = new StudentSetClass(123,"xyz",LocalDate.of(1998, 5, 20));

        set1.add(st);
        set1.add(st2);

        System.out.println("Initial TreeSet Class:-" +set1);
    }

    public static void HashSet(){
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(7);
        set.add(2);
        set.add(17);
        set.add(12);
        set.add(17);
        set.add(12);

        System.out.println("Initial Hashset:-" + set);
    }

    public static void TreeSet(){
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(7);
        set.add(2);
        set.add(17);
        set.add(12);
        set.add(17);
        set.add(12);

        System.out.println("Initial Treeset:-" + set);
    }
}
