package TestClassesEx.ClassObjectEx;

public class AccountClass {
    int accountNo;
    String accountName;
    long bal;
    AccountClass(int accountNo,String accountName, long bal){
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.bal =bal;
    }
    public  void  addBal(int bal){
        this.bal = this.bal + bal;
    }
    public  void  withdrawBal(int bal){
        this.bal = this.bal - bal;
    }
    public  void displayStatus(){
        System.out.println("Account No :" + this.accountNo+ "\n Account Name :"+ this.accountName +"\n Balance:" + this.bal);
    }

    public void  addbalWithClassObj(AccountClass ac){
        this.bal = this.bal + ac.bal;
    }
}
