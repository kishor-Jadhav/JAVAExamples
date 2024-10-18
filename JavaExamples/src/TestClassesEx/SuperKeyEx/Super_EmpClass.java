package TestClassesEx.SuperKeyEx;

public class Super_EmpClass extends Super_PersonClass{
    int empId;
    String empName;
    final int empAccNo=0;
    static {  int empAccNo = 100;};
    Super_EmpClass( int empId,String empName,int mobNo,String city){
        super(mobNo,city);
        this.empId =empId;
        this.empName =empName;


    }
    public  void  display(){
        System.out.println("mobNo :" + this.mobno);
    }
}
