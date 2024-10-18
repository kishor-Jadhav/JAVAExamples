package TestClassesEx.ClassObjectEx;

public class Car_Class {
    int milage;
    float speed;
    String brandName;
public  void initialise(String BN, int m){
    this.milage =m;
    this.brandName = BN;

}
public void display(){
    System.out.println("Brand Name:"+this.brandName+" Milage: "+ this.milage );
}
}
