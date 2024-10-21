package MoreExamples;
class Parent {
    int rollNo;
    String name;
    public void displayInfo(){
        System.out.println("RollNo: "+ rollNo +" Name: "+ name);
        int[] a ={1,2,3,4};
        for(int b: a){
            System.out.println("Array element:- " + b);
        }
    }
}

class ChildLevel1 extends Parent{
    public  void displayFromChild(){
        displayInfo();
    }

    public void displayInfoFromChild(){
        System.out.println("Child:- RollNo: "+ rollNo +" Name: "+ name);
    }
}
public class InheritanceExample {
    public  static  void main(String[] args){
        ChildLevel1 ch = new ChildLevel1();
        ch.rollNo = 123;
        ch.name = "kishor";
        ch.displayInfo();
        ch.displayInfoFromChild();
    }
}
