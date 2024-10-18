package TestClassesEx.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_List {
    void Collection_List(){
        List<String> list=new ArrayList<>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Iterating the List element using for-each loop
        for(String fruit:list){
            System.out.println(fruit);

        }
        // Convert array to List
        String[] array={"Java","Python","PHP","C++"};
        List<String> list1=new ArrayList<String>();
        for(String lang:array){
            list1.add(lang);
        }
        System.out.println("Printing List: "+list1);

        //Converting ArrayList to Array
        String[] array1 = list1.toArray(new String[list1.size()]);
        System.out.println("Printing Array: "+array1.toString());

        //Sorting the list
        Collections.sort(list1);
    }
}
