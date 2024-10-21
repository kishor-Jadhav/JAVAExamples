package MoreExamples;

import java.util.Arrays;

class OuterClass{
    public void getOuterMsg(){
        System.out.println("Get Outer Msg");
    }
    class InnerClass{
        int price;
        public int getPrice(){
            return price;
        }
        public void updatePrice(){
            price = price+20;
        }
    }
}
public class InnerClassExample {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.getOuterMsg();
        OuterClass.InnerClass inner = out.new InnerClass();
        inner.updatePrice();
        System.out.println("Price = " + inner.getPrice());
    }
}
