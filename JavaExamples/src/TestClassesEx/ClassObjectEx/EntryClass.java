package TestClassesEx.ClassObjectEx;

public class EntryClass {
    public  static  void  main(String[] arg){
        Car_Class carObj = new Car_Class();
        carObj.brandName = "BMW";
        carObj.milage = 40;
        System.out.println("Brand Name:"+carObj.brandName+" Milage: "+ carObj.milage );

        carObj.initialise("Mercidies",50);
        System.out.println("Brand Name:"+carObj.brandName+" Milage: "+ carObj.milage );

        carObj.initialise("Audi",80);
        carObj.display();

        AccountInfo();
    }

    public  static  void AccountInfo(){
        AccountClass accObj =new AccountClass(111,"Kishor Jadhav",990000000);
        accObj.displayStatus();
        accObj.addBal(1000);
        accObj.displayStatus();
        accObj.withdrawBal(55);
        accObj.displayStatus();
        System.out.println("Using Object--------");
        AccountClass accObj2 =new AccountClass(111,"Abc Patil",100);
        accObj2.displayStatus();
        AccountClass accObj3 =new AccountClass(111,"Abc Patil",20);
        accObj2.addbalWithClassObj(accObj3);
        accObj2.displayStatus();

    }
}
