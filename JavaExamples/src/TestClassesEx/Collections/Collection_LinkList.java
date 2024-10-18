package TestClassesEx.Collections;

import java.util.LinkedList;
import java.util.List;

public class Collection_LinkList {
    void  LinkListExample(){
        List<Collection_StudentClass> list = new LinkedList<Collection_StudentClass>();
        Collection_StudentClass st1 =new Collection_StudentClass(2,"ABC");
        Collection_StudentClass st2 =new Collection_StudentClass(3,"XYZ");
        Collection_StudentClass st3 =new Collection_StudentClass(4,"xxx");
        list.add(st1);
        list.add(st2);
        list.add(st3);
        for(Collection_StudentClass obj: list){
            System.out.println("Item : "+ obj);
        }
    }
}
