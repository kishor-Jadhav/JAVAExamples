package MoreExamples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class StudentListClass{
    int rollNo;
    String studentName;
    LocalDate birthdate;
    StudentListClass(int rollNo,String studentName,LocalDate birthdate){
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.birthdate = birthdate;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudentListClass that = (StudentListClass) obj;
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
public class CollectionExample {
    public static void main(String[] args) {
        ArrayListCollection();
        LinkedListCollection();
        ListClassCollection();
    }
    public static void ListClassCollection() {
     List<StudentListClass> stList = new ArrayList<>();
     StudentListClass st = new StudentListClass(12,"Ram",LocalDate.of(2000, 1, 15));
     StudentListClass st2 = new StudentListClass(123,"xyz",LocalDate.of(1998, 5, 20));

     stList.add(st);
     stList.add(st2);

     System.out.println(stList);
     System.out.println("ArrayList Size: -" + stList.size());
     System.out.println("Is Empty: -" + stList.isEmpty());
     for(StudentListClass stObj: stList){
         System.out.println("Student Name:-"+stObj.studentName + " RollNo:-"+ stObj.rollNo);
     }
        System.out.println("Get element from class:-" + stList.get(1));

        System.out.println("Contains 'st3' (RollNo: 12, Name: Ram): " + stList.contains(st2));

        StudentListClass st3 = new StudentListClass(345,"xyz",LocalDate.of(1998, 5, 20));
        System.out.println("Contains 'st3' : " + stList.contains(st3));
    }

    public static void ArrayListCollection(){
        List<Integer> li =new ArrayList<>();
        li.add(5);
        li.add(7);
        li.add(2);
        li.add(17);
        li.add(12);

        System.out.println("ArrayList: -" + li);
        System.out.println("ArrayList Size: -" + li.size());
        System.out.println("Is Empty: -" + li.isEmpty());
        System.out.println("ArrayList contain 12: -" + li.contains(12));
        li.remove(2);
        System.out.println("ArrayList: -" + li);
        li.remove(Integer.valueOf(2));

        List<Integer> li2 =new ArrayList<>();
        li2.add(35);
        li2.add(27);
        li2.add(7);
        li2.add(27);

        li.retainAll(li2);
        System.out.println("Retain li with l2:-"+ li);
        li.addAll(li2);
        System.out.println("Merge li with l2:-"+ li);
        li.clear();
    }

    public static void LinkedListCollection(){
        List<Integer> li =new LinkedList<>();
        li.add(5);
        li.add(7);
        li.add(2);
        li.add(17);
        li.add(12);

        System.out.println("LinkedList: -" + li);
        System.out.println("LinkedList Size: -" + li.size());
        System.out.println("Is Empty: -" + li.isEmpty());
        System.out.println("LinkedList contain 12: -" + li.contains(12));
        li.remove(2);
        System.out.println("LinkedList: -" + li);
        li.remove(Integer.valueOf(2));

        List<Integer> li2 =new LinkedList<>();
        li2.add(35);
        li2.add(27);
        li2.add(7);
        li2.add(27);

        li.retainAll(li2);
        System.out.println("Retain li with l2:-"+ li);
        li.addAll(li2);
        System.out.println("Merge li with l2:-"+ li);
        li.clear();
    }
}
