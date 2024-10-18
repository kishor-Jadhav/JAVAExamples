import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       // getInput();
        controll_For();
       // StringOpration();
    }

    private  static  void  getInput(){
       int x = 10;
        System.out.println(--x);
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);


    }

    public static void controll_For() {
        for(int i=1; i<10; i++){

            if(i%2==0){
                System.out.println("Event ="+i);
               String str = String.valueOf(i);
            }else{
                System.out.println("Odd ="+i);
            }

            //Using ternary
            String outstr = (i%2==0) ? "Event ="+i : "Odd ="+i;
            System.out.println(outstr);

        }

        //Collection

        String[] strcol ={"Java","Python","React","Angular"};
        for (String sval:strcol){
            System.out.println(sval);
        }

    }

    private static  void  castingExample(){
        String str ="10";
        long Id = 1233;
        int a = Integer.parseInt(str);
        float b= Float.parseFloat(str);
        String c= String.valueOf(a);
        int d=(int)Id;
    }

    private static  void StringOpration(){
        String str ="welcome, to india";
        System.out.println(str.length());
        System.out.println(str.endsWith("ia"));
        System.out.println(str.contains("to"));
        System.out.println(str.split(",")[0]);
        System.out.println(str.split(",")[1]);
    }
}

