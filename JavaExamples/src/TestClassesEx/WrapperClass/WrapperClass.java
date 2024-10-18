package TestClassesEx.WrapperClass;
/*Java is an object-oriented programming language, so we need to deal with objects many times like in Collections, Serialization, Synchronization, etc. Let us see the different scenarios, where we need to use the wrapper classes.

Change the value in Method: Java supports only call by value. So, if we pass a primitive value, it will not change the original value. But, if we convert the primitive value in an object, it will change the original value.
Serialization: We need to convert the objects into streams to perform the serialization. If we have a primitive value, we can convert it in objects through the wrapper classes.
Synchronization: Java synchronization works with objects in Multithreading.
java.util package: The java.util package provides the utility classes to deal with objects.
Collection Framework: Java collection framework works with objects only. All classes of the collection framework (ArrayList, LinkedList, Vector, HashSet, LinkedHashSet, TreeSet, PriorityQueue, ArrayDeque, etc.) deal with objects only.

 */
public class WrapperClass {
    public static void main(String[] args) {
        //Autoboxing
        //Converting int into Integer
        int a=20;
        Integer i=Integer.valueOf(a);//converting int into Integer explicitly
        Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a+" "+i+" "+j);

        //Unboxing
        //Converting Integer to int
        Integer aa=3;
        int ii=aa.intValue();//converting Integer to int explicitly
        int jj=aa;//unboxing, now compiler will write a.intValue() internally

        System.out.println(aa+" "+ii+" "+jj);

        /////////////////////////////////////////////
        byte b=10;
        short s=20;
        int i2=30;
        long l=40;
        float f=50.0F;
        double d=60.0D;
        char c='a';
        boolean b2=true;

//Autoboxing: Converting primitives into objects
        Byte byteobj=b;
        Short shortobj=s;
        Integer intobj=i2;
        Long longobj=l;
        Float floatobj=f;
        Double doubleobj=d;
        Character charobj=c;
        Boolean boolobj=b2;

//Printing objects
        System.out.println("---Printing object values---");
        System.out.println("Byte object: "+byteobj);
        System.out.println("Short object: "+shortobj);
        System.out.println("Integer object: "+intobj);
        System.out.println("Long object: "+longobj);
        System.out.println("Float object: "+floatobj);
        System.out.println("Double object: "+doubleobj);
        System.out.println("Character object: "+charobj);
        System.out.println("Boolean object: "+boolobj);

//Unboxing: Converting Objects to Primitives
        byte bytevalue=byteobj;
        short shortvalue=shortobj;
        int intvalue=intobj;
        long longvalue=longobj;
        float floatvalue=floatobj;
        double doublevalue=doubleobj;
        char charvalue=charobj;
        boolean boolvalue=boolobj;

//Printing primitives
        System.out.println("---Printing primitive values---");
        System.out.println("byte value: "+bytevalue);
        System.out.println("short value: "+shortvalue);
        System.out.println("int value: "+intvalue);
        System.out.println("long value: "+longvalue);
        System.out.println("float value: "+floatvalue);
        System.out.println("double value: "+doublevalue);
        System.out.println("char value: "+charvalue);
        System.out.println("boolean value: "+boolvalue);
    }
}
