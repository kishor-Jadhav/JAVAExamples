package TestClassesEx.Aggregation;

public class Agg_EmpInfo {
    String empName;
    int salary;
    Agg_ClassAddress ag;
    Agg_EmpInfo( String empName,int salary,Agg_ClassAddress ag){
        this.empName =empName;
        this.salary =salary;
        this.ag =ag;
    }
    public  void  display(){
        System.out.println("Emp Name:" + this.empName);
        System.out.println("City:" + this.ag.cityName);
        System.out.println("State:" + this.ag.state);
    }
}
