package TestClassesEx.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection_ArrayList {
    void ArrayListExample(){
        //creating old non-generic arraylist
        ArrayList list =new ArrayList();
        list.add(1);
        list.add("abc");
        list.add(1);
        System.out.println("non-generic array" + list);

        //creating old generic arraylis
        ArrayList <String> stringList = new ArrayList();
        stringList.add(String.valueOf(1));
        stringList.add("A");
        stringList.add("B");
        System.out.println("generic String array" + stringList);

        ArrayList <Integer> intArrayList =new ArrayList<Integer>();
        intArrayList.add(200);
        intArrayList.add(300);
        System.out.println("generic Integer array" + intArrayList);
        System.out.println("get element: "+ intArrayList.get(1)); // using index
        intArrayList.set(0,500);
        for(int re: intArrayList){
            System.out.println("Inte values:"+ re);
        }
    }

    public   void SortArrayList(){
        ArrayList<String> st =new ArrayList<String>();
        st.add("abc");
        st.add("xyz");
        st.add("exx");
        Collections.sort(st);
        for(String re: st){
            System.out.println("String values:"+ re);
        }
        ListIterator<String> itrator = st.listIterator(st.size());
        System.out.println("Traversing list through for loop:");
        for(int i=0; i<=st.size()-1; i++){
            System.out.println("values:"+ st.get(i));
        }
        System.out.println("Traversing list through forEach:");
        st.forEach(a->{ //Here, we are using lambda expression
            System.out.println("values :" + a);
        });
    }

    public  void ArrayListUsingClass(){
        Collection_StudentClass st1 =new Collection_StudentClass(2,"ABC");
        Collection_StudentClass st2 =new Collection_StudentClass(3,"XYZ");
        Collection_StudentClass st3 =new Collection_StudentClass(4,"xxx");

        ArrayList<Collection_StudentClass> studlist =new ArrayList<Collection_StudentClass>();
        studlist.add(st1);
        studlist.add(st2);
        studlist.add(st3);
        System.out.println("Is ArrayList Empty: "+studlist.isEmpty());
        System.out.println("The size of the array is: " + studlist.size());

        System.out.println("Using Iterator and while");
        Iterator itr = studlist.listIterator();
        while (itr.hasNext()){
            Collection_StudentClass stud = (Collection_StudentClass)itr.next();
            System.out.println("Student Id:"+stud.studId);
            System.out.println("Student Name:"+stud.studeName);
        }
        System.out.println("Using for loop");
        for(Collection_StudentClass ob:studlist){
            System.out.println("Student Id:"+ob.studId);
            System.out.println("Student Name:"+ob.studeName);
        }
    }
}
