package TestClassesEx.StaticExample;

public class StudentInfo {
    String studentName;
    int studId;
    static String collegeName ="IIF";
    static int totalvisit=0;
    StudentInfo(String studentName , int studId){
        this.studentName = studentName;
        this.studId = studId;
    }
    public  void addTotalVisit(){
        totalvisit++;
        System.out.println("totalvisit :" + totalvisit);

    }
   public  static  void change(){
       collegeName ="TKT";
       System.out.println("collegeName :" + collegeName);
   }
   public void display(){
       System.out.println("student No: " + this.studId + " Student Name;"+ this.studentName +" College name:"+  collegeName);
    }
}
