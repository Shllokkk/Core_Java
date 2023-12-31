class Sample1{

    static int a=3;
    static int b;

    static{
        System.out.println("Inside Static block of Sample1...");
        b=a*4;
    }

    static void set(int x){
        System.out.println("Value of x: " + x);
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }
}

public class StaticSample1 {

    static{
        System.out.println("Inside Static of StaticSample1....");
    }
    public static void main(String[] args){

        System.out.println("Inside Main....");
        Sample1 obj1=new Sample1();
        Sample1 obj2=new Sample1();
        Sample1 obj3=new Sample1();

        Sample1.set(100);
        obj1.a=1000;                            // static variables should be accesed in a static way
        obj1.b=4;
        Sample1.set(20);
        Sample1.a=12;
        obj2.set(40);                         // static methods should be accessed in a static way
        obj3.b=1;
        obj1.a=2;
        obj3.set(3);
        }
}
