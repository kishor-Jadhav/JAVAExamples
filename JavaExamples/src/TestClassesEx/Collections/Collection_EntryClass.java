package TestClassesEx.Collections;

import org.w3c.dom.DOMStringList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection_EntryClass {
    public static void main(String[] args) {
        //Array List
        ArrayListRun();
        LinkedListRun();
        ListRun();
    }
    public  static  void ListRun(){
        Collection_List li = new Collection_List();
    }

    public  static  void ArrayListRun() {
        //Array List
        Collection_ArrayList collArray = new Collection_ArrayList();
        collArray.ArrayListExample();
        collArray.SortArrayList();
        collArray.ArrayListUsingClass();
    }

    public  static  void LinkedListRun() {
        Collection_LinkList collLinked = new Collection_LinkList();
        collLinked.LinkListExample();
    }

}
