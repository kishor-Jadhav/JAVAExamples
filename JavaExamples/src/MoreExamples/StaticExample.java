package MoreExamples;
class StaticExClass{
    private static int count;
    public static void CountIncrease(){
        count ++;
    }
    public static int getCount(){
        return count;
    }
}
public class StaticExample {
    static {
        StaticExClass.CountIncrease();
        System.out.println("Static block -1 called before main"); //first called
    }
    public static  void main(String[] args){
        System.out.println("main method called");
        displayMsg(); // calling without obj
        StaticExClass.CountIncrease();
        StaticExClass.CountIncrease();
        System.out.println("Count is:- "+ StaticExClass.getCount());
        System.out.println("Max No. is:- "+ Math.max(5,6)); // static max function

    }
    static {
        System.out.println("Static block -2 called before main");
    }
    static {
        System.out.println("Static block -3 called before main");
    }
    public static void displayMsg(){
        System.out.println("Message printing....");
    }
}
