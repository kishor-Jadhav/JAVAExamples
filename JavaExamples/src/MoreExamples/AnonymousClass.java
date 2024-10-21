package MoreExamples;
class OuterAnonymousClass{
    void outeerClassMethod(){}
}
public class AnonymousClass {
    public static void main(String[] args) {
        OuterAnonymousClass out = new OuterAnonymousClass(){
            void getOuterMsg(){
                System.out.println("Outer anonymous message");
            }
            @Override
            void outeerClassMethod(){
                System.out.println("Outer Override anonymous message");
            }
        };

        out.outeerClassMethod();

    }
}
