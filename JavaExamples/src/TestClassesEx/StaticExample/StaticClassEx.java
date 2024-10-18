package TestClassesEx.StaticExample;
//The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
//The static variable gets memory only once in the class area at the time of class loading.
//Ex.
//Suppose there are 500 students in my college, now all instance data members will get memory each time when the object is created.
// All students have its unique rollno and name,
// so instance data member is good in such case.
// Here, "college" refers to the common property of all objects.
// If we make it static, this field will get the memory only once.

//Why is the Java main method static
//It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.

//Can we execute a program without main() method?
//No, one of the ways was the static block, but it was possible till JDK 1.6. Since JDK 1.7, it is not possible to execute a Java class without the main
public class StaticClassEx {
    static{System.out.println("static block is invoked");}
    public  static  void  main(String[] args){
        StudentInfo st =new StudentInfo("ABC",5);
        st.addTotalVisit();
        st.addTotalVisit();
        st.display();
        StudentInfo st1 =new StudentInfo("XYZ",5);
        StudentInfo.change(); //for static method
        st1.addTotalVisit();
        st1.display();


    }
}
