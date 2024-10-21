package MoreExamples;

import java.util.Arrays;

abstract class AbstractParent{
     public abstract void dispalayMsg(); //Abstract method cannnot have body

    public void getMesg(){ //non abstact method woking as inheritance
        System.out.println("Get Msg");
    }
}

class AbstractChildClass extends AbstractParent{  // This is multi level. multiple not supported

    @Override
    public void dispalayMsg() {
        System.out.println("Dipslay msg child");
    }
}
public class AbstractClassExample {
    public static void main(String[] args) {
        AbstractChildClass ab =new AbstractChildClass();
        ab.dispalayMsg();
        ab.getMesg();
    }
}
