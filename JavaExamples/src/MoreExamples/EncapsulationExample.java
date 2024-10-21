package MoreExamples;

import java.util.Arrays;

class  StudentInfo{
   private int rollNo;
   private String name; // These are not accessible out class
   public boolean updateName;

   public void setName(String name){
       if(updateName){   // we can add conditions for update fields
           this.name = name;
       }
   }

   public String getName()
   {
       return name;
   }
}
public class EncapsulationExample {
    public  static  void main(String[] args){
        StudentInfo stInfo = new StudentInfo();
        stInfo.updateName = true;
        stInfo.setName("Kishor");
        System.out.println("Name = " + stInfo.getName());
    }

}
