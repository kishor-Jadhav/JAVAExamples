package TestClassesEx.Aggregation;
//Method overloading increases the readability of the program.
//
//Different ways to overload the method
//There are two ways to overload the method in java
//
//By changing number of arguments
//By changing the data type

//has multiple methods having same name but different in parameters
public class Agg_EntryClass {
    public  static  void main(String[] args){
        //Pasing class object
        Agg_ClassAddress ag =new Agg_ClassAddress("Sangli","MH");
        Agg_EmpInfo emp = new Agg_EmpInfo("Abc",10000,ag);
        emp.display();


    }
}
