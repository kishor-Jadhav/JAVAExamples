package MoreExamples;

import java.util.Arrays;

interface BankInterface{
    public void displayStatement();
    public void updateInterest();
    public float getIntrest();
    public default String getInterfaceMesg(){
        return "Msg from interface";
    };
}

class SBIBankClass implements BankInterface{
    private float intrest=0;
    private double dblrest=0;

    public void setIntrest(float intrest) {
        this.intrest = intrest;
    }

    @Override
    public void displayStatement() {
        System.out.println("SBI Intrest:- "+ this.intrest +" SBI double Intrest:- "+ this.dblrest);
    }

    @Override
    public void updateInterest() {
        this.intrest = (float) (this.intrest + 0.05);
        this.intrest = this.intrest + 0.05f;
        this.dblrest = this.dblrest + 0.05;
    }

    @Override
    public float getIntrest() {
        return intrest;
    }
}

class HDFCBankClass implements BankInterface{
    private float intrest=0;
    private double dblrest=0;

    public void setIntrest(float intrest) {
        this.intrest = intrest;
    }

    @Override
    public void displayStatement() {
        System.out.println("HDFC Intrest:- "+ this.intrest +" HDFC double Intrest:- "+ this.dblrest);

    }

    @Override
    public void updateInterest() {
        this.intrest = (float) (this.intrest + 0.05);
        this.intrest = this.intrest + 0.15f;
        this.dblrest = this.dblrest + 0.25;
    }

    @Override
    public float getIntrest() {
        return intrest;
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        BankInterface sbiInft;
        BankInterface sbiInft2;

        sbiInft = new SBIBankClass();
        sbiInft.updateInterest();
        sbiInft.displayStatement();

        //------------------------------

        sbiInft2 = new SBIBankClass();
        sbiInft2.updateInterest();
        sbiInft2.displayStatement();

        //------------------------------
        sbiInft = new HDFCBankClass();
        sbiInft.updateInterest();
        sbiInft.displayStatement();

        //-------default-------

        System.out.println(sbiInft.getInterfaceMesg());

    }
}
